/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
import java.util.Date;

/**
 *
 * @author account
 */
public class Calcul_Soumission {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, SQLException, ParseException {

        //vérifie que le nombre d'arguments entrés est suffisant 
        //syntaxe: java -jar dist/Projet-Soumission_Assurance.jar nom_fichier_entree.json nom_fichier_sortie.json
        if(args.length<2)
        {
            System.out.println("Nombre d'arguments insuffisants");
            return;
        }
       
        String fileVoiture = "json/voitures.json";
        String fileDemande = args[0];
        
        String voitureAdmissJsonText = lecteurJSON(fileVoiture);
        String donneeEntreeJsonText = lecteurJSON(fileDemande);
                
/////////////////////////////////        
        // declaration du tableau qui va contenir la chaine de caractere lue dans le fichier
        // qui contient la liste des voitures assurables
        JSONArray root;
        root = (JSONArray) JSONSerializer.toJSON(voitureAdmissJsonText);

        // declaration d'un objet JSON qui va recevoir la chaine de caractere
        // qui contient les donnees sur la voiture, conducteur et le contrat
        JSONObject json = (JSONObject) JSONSerializer.toJSON(donneeEntreeJsonText);

        // declaration de l'objet voiture qui va nous permettre d'extraire les attributs
        JSONObject voiture = json.getJSONObject("voiture");

        // declaration de l'objet conducteur qui va nous permettre d'extraire les attributs
        JSONObject conducteur = json.getJSONObject("conducteur");

        // declaration de la variable durContrat qui recevra la duree du contrat
        int durContrat = json.getInt("duree_contrat");

////////////////        
        
        Voiture voiture1 = new Voiture(voiture.getInt("annee"),
                voiture.getString("marque"),
                voiture.getString("modele"),
                voiture.getInt("valeur_des_options"),
                voiture.getString("burinage"),
                voiture.getBoolean("garage_interieur"),
                voiture.getBoolean("systeme_alarme"));
        // declaration des variables de l'objet voiture

        Conducteur conducteur1 = new Conducteur(conducteur.getString("date_de_naissance"),
                conducteur.getString("province"),
                conducteur.getString("ville"),
                conducteur.getString("sexe"),
                conducteur.getString("date_fin_cours_de_conduite"),
                conducteur.getBoolean("cours_de_conduite_reconnus_par_CAA"),
                conducteur.getBoolean("premier_contrat"));
        
        float valInitilaVoit = 0; // valeur initiale du vehicule

        for (int j = 0; j < root.size(); j++) {

            JSONObject document = root.getJSONObject(j);
            if ((document.getInt("annee") == voiture1.getAnnee())) { //Si on ajoute des années autre que 2014
                if ((document.getString("marque").compareTo(voiture1.getMarque()) == 0)) { //Si on ajoute des marques autre que "Porsche"
                    if ((document.getString("modele").compareTo(voiture1.getModele()) == 0)) {
                        valInitilaVoit = document.getInt("valInit");
                        j=root.size();//ferme la boucle
                        //System.out.println("La valeur initiale est: " + valInitilaVoit);
                    }
                }
            }
        }

        /*
         * Les declarations suivates serviront a calculer la difference entre les dates
         */

        // declaration pour avoir la date courante (date systeme)
        Timestamp dateCourante = new Timestamp((new java.util.Date()).getTime());

        // regler le format de la date sur "yyyy-MM-dd"
        SimpleDateFormat formatAMJ = new SimpleDateFormat("yyyy-MM-dd");
        formatAMJ.setLenient(false);

        // conversion de la date de naissance en format string pour un format Date
        java.util.Date DDN;
        DDN = formatAMJ.parse(conducteur1.getDate_de_naissance());

        // conversion de la date de fin du cours en format string pour un format Date
        java.util.Date DateFinCours;
        DateFinCours = formatAMJ.parse(conducteur1.getDate_fin_cours_de_conduite());

        //System.out.println("La chaine de caractere represente : " + formatAMJ.format(DDN));



        //déclaration d'un calendrier pour date de naissance
        GregorianCalendar gregC1 = new GregorianCalendar();
        // initialise le calendrier à la valeur date1;
        gregC1.setTime(DDN);

        // déclaration d'un calendrier pour date de fin du cours
        GregorianCalendar gregC2 = new GregorianCalendar();
        // initialise le calendrier à la valeur date1;
        gregC2.setTime(DateFinCours);

        // déclaration d'un calendrier pour date courante
        GregorianCalendar gregC3 = new GregorianCalendar();
        // initialise le calendrier à la valeur date1;
        gregC3.setTime(dateCourante);


        // calcul de la difference d'age en jours
        long differenceAge = gregC3.getTime().getTime() - gregC1.getTime().getTime();
        double diffAgeJour = differenceAge / (24 * 60 * 60 * 1000.0);

        // calcul de l'experience du conducteur en jour
        long differenceExperience = gregC3.getTime().getTime() - gregC2.getTime().getTime();
        double diffExpJour = differenceExperience / (24 * 60 * 60 * 1000.0);


        // appel de la methode calculSoumission qui va retourner la valeur de la soumission
        float ValRet, mensualite;
        ValRet = calculSoumission(durContrat, valInitilaVoit, voiture1, conducteur1, diffAgeJour, diffExpJour);

        //System.out.println("montant_annuel : " + ValRet);
        mensualite = (float) ((ValRet + (ValRet * 0.015)) / 12);
        //System.out.println("Mensualite : " + mensualite);

        
        boolean assurable=true; // Validation d'assurabilité à faire
        
        BufferedWriter fichSortie = new BufferedWriter(new FileWriter(new File(args[1])));
        String donneeSortieJsonText="";
        
        JSONObject jsonSortie=new JSONObject();
        jsonSortie.accumulate("assurable",assurable);
        if(assurable)
        {
            jsonSortie.accumulate("montant_annuel",ValRet);
            jsonSortie.accumulate("mensualite",mensualite);
        }
        
        donneeSortieJsonText=jsonSortie.toString();
        
        //System.out.println(donneeSortieJsonText);
        
        fichSortie.append(donneeSortieJsonText);
        fichSortie.close();

    } // fin main 

    /*
     * @fonction calculSoumission qui va calculer la valeur de la soumission a partir des regles
     * @retour : valeur soumission
     * @param : 
     */
    public static float calculSoumission(int durContrat, float valInitilaVoit, Voiture voitureDuDemandant, Conducteur Demandant, double diffAgeJour, 
            double diffExpJour) {

        // calcul de la soumission
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
    } // fin fonction calculSoumission

public static String lecteurJSON(String path) throws FileNotFoundException, IOException {
    String contenu = "";
    String line = "";
    BufferedReader fichierJSON;
        
        fichierJSON = new BufferedReader(
                new FileReader(new File(path)));
      
        // lire tant qu'on a pas atteint la fin du fichier des voitures admissibles
        while ((line = fichierJSON.readLine()) != null) {
            contenu += line;
        }
        
        //Fermeture du fichier des voitures admissibles
        fichierJSON.close();
    return contenu;

}

} // fin classe Calcul_Soumission
