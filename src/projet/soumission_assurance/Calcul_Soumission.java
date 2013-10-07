package projet.soumission_assurance;

import java.sql.*;
import java.util.*;
import java.text.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

public class Calcul_Soumission {

    public static void main(String[] args) throws FileNotFoundException, IOException, SQLException, ParseException {

        if(verifierNombreArgumentsMain(args))
            return;

        String voitureAdmissJsonText = lecteurJSON("json/voitures.json");
        String donneeEntreeJsonText = lecteurJSON(args[0]);
                
        JSONArray root = (JSONArray) JSONSerializer.toJSON(voitureAdmissJsonText);
        JSONObject json = (JSONObject) JSONSerializer.toJSON(donneeEntreeJsonText);
        JSONObject voiture = json.getJSONObject("voiture");
        JSONObject conducteur = json.getJSONObject("conducteur");
        int durContrat = json.getInt("duree_contrat");

        Voiture voiture1 = new Voiture(voiture.getInt("annee"),
                voiture.getString("marque"),
                voiture.getString("modele"),
                voiture.getInt("valeur_des_options"),
                voiture.getString("burinage"),
                voiture.getBoolean("garage_interieur"),
                voiture.getBoolean("systeme_alarme"));

        Conducteur conducteur1 = new Conducteur(conducteur.getString("date_de_naissance"),
                conducteur.getString("province"),
                conducteur.getString("ville"),
                conducteur.getString("sexe"),
                conducteur.getString("date_fin_cours_de_conduite"),
                conducteur.getBoolean("cours_de_conduite_reconnus_par_CAA"),
                conducteur.getBoolean("premier_contrat"));
        
        float valInitilaVoit = definirValeurInitialVoiture(root, voiture1);

        Timestamp dateCourante = new Timestamp((new java.util.Date()).getTime());
        
        SimpleDateFormat formatAMJ = reglerFormatDate();

        // conversion de la date de naissance en format string pour un format Date
        java.util.Date DDN;
        DDN = formatAMJ.parse(conducteur1.getDate_de_naissance());

        // conversion de la date de fin du cours en format string pour un format Date
        java.util.Date DateFinCours;
        DateFinCours = formatAMJ.parse(conducteur1.getDate_fin_cours_de_conduite());

        GregorianCalendar gregC1 = new GregorianCalendar();
        gregC1.setTime(DDN);

        GregorianCalendar gregC2 = new GregorianCalendar();
        gregC2.setTime(DateFinCours);

        GregorianCalendar gregC3 = new GregorianCalendar();
        gregC3.setTime(dateCourante);

        double diffAgeJour = (gregC3.getTime().getTime() - gregC1.getTime().getTime()) / (24 * 60 * 60 * 1000.0);
        double diffExpJour = (gregC3.getTime().getTime() - gregC2.getTime().getTime()) / (24 * 60 * 60 * 1000.0);

        float ValRet = calculSoumission(durContrat, valInitilaVoit, voiture1, conducteur1, diffAgeJour, diffExpJour);
        float mensualite = (float) ((ValRet + (ValRet * 0.015)) / 12);
        
        boolean assurable=true; 
        
        BufferedWriter fichSortie = new BufferedWriter(new FileWriter(new File(args[1])));
        String donneeSortieJsonText="";
        
        donneeSortieJsonText=genererJsonEnSortie(assurable, ValRet, mensualite);
        
        fichSortie.append(donneeSortieJsonText);
        fichSortie.close();

    }

    public static float calculSoumission(int durContrat, float valInitilaVoit, Voiture voitureDuDemandant, Conducteur Demandant, double diffAgeJour, 
            double diffExpJour) {

        float valCumul = (float) (valInitilaVoit * 0.09); // valeur cumulee de la soumission
        float valRetour = 0;

        if (durContrat == 3) {
            valCumul -= ((valCumul * 15) / 100);
        }
        
        valCumul = (float) (valCumul + ((float) voitureDuDemandant.getValeur_des_options() * 0.10));

        if ((Demandant.getVille().compareTo("Montréal") == 0) || (Demandant.getVille().compareTo("Longueuil") == 0)) {
            valCumul += 200;
        }
        if (voitureDuDemandant.getBurinage().compareTo("Sherlock") == 0) {
            valCumul += 250;
        }
        if (Demandant.getSexe().compareTo("F") == 0) {
            valCumul -= 1000;
        }
        if (voitureDuDemandant.getGarage_interieur() == true) {
            valCumul -= 500;
        }
        if (voitureDuDemandant.getSysteme_alarme() == true) {
            valCumul -= 500;
        }
        if (Demandant.getCours_de_conduite_reconnus_par_CAA() == true) {
            valCumul -= 100;
        }
        if ((diffAgeJour < (35 * 365)) && (Demandant.getSexe().compareTo("M") == 0)) {
            valCumul += 1000;
        }
        if (Demandant.getPremier_contrat() == true) {
            valCumul += 2000;
        }
        
        valRetour = valCumul;

        if (diffExpJour > (15 * 365)) {
            valCumul -= 400;
            valRetour = valCumul;
        }

        return valRetour;
    }
    
public static String lecteurJSON(String path) throws FileNotFoundException, IOException {
    String contenu = "";
    String line = "";
    BufferedReader fichierJSON;
        
        fichierJSON = new BufferedReader(
                new FileReader(new File(path)));
      
        while ((line = fichierJSON.readLine()) != null) {
            contenu += line;
        }
        
        fichierJSON.close();
    return contenu;

}

    private static boolean verifierNombreArgumentsMain(String[] args) {
        if (args.length<2) {
            System.out.println("Nombre d'arguments insuffisants");
            return true;
        }
        return false;
    }

    private static float definirValeurInitialVoiture(JSONArray root, Voiture voiture1) {
        float valInitilaVoit = 0;
        for (int j = 0; j < root.size(); j++) {

            JSONObject document = root.getJSONObject(j);
            if ((document.getInt("annee") == voiture1.getAnnee())) {
                if ((document.getString("marque").compareTo(voiture1.getMarque()) == 0)) {
                    if ((document.getString("modele").compareTo(voiture1.getModele()) == 0)) {
                        valInitilaVoit = document.getInt("valInit");
                        j=root.size();
                    }
                }
            }
        }
        return valInitilaVoit;
    }

    private static SimpleDateFormat reglerFormatDate() {
        SimpleDateFormat formatAMJ = new SimpleDateFormat("yyyy-MM-dd");
        formatAMJ.setLenient(false);
        return formatAMJ;
    }

    private static String genererJsonEnSortie(boolean assurable, float ValRet, float mensualite) {
        String donneeSortieJsonText;
        JSONObject jsonSortie=new JSONObject();
        jsonSortie.accumulate("assurable",assurable);
        if(assurable)
        {
            jsonSortie.accumulate("montant_annuel",ValRet);
            jsonSortie.accumulate("mensualite",mensualite);
        }
        donneeSortieJsonText=jsonSortie.toString();
        return donneeSortieJsonText;
    }

}