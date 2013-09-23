/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.soumission_assurance;

import java.sql.*;
import java.util.*;
import java.text.*;

import java.io.BufferedReader;
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



        // instructions pour lire le fichier qui contient les infos sur les voitures admissibles
        BufferedReader infoVoiture, fichEntree;
        infoVoiture = new BufferedReader(
                new FileReader(new File("VoituresAdmissibles.json")));
        // instructions pour lire le fichier d'entree
        fichEntree = new BufferedReader(
                new FileReader(new File("fichierEntree1.json")));


        // lire tant qu'on a pas atteint la fin du fichier "VoituresAdmissibles.json"
        String voitureAdmissJsonText = "";
        String line = "";
        while ((line = infoVoiture.readLine()) != null) {
            voitureAdmissJsonText += line;
        }

        // affichage du contenu du fichier json
        //System.out.println(voitureAdmiss);

        // lire tant qu'on a pas atteint la fin du fichier "fichierEntree1.json"
        String donneeEntreeJsonText = "";
        String lineEntree = "";
        while ((lineEntree = fichEntree.readLine()) != null) {
            donneeEntreeJsonText += lineEntree;
        }
        //System.out.println(donneeEntreeJsonText);


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


        // declaration des variables de l'objet voiture
        String marque = voiture.getString("marque");
        String modele = voiture.getString("modele");
        String burinage = voiture.getString("burinage");
        int valeur_des_options = voiture.getInt("valeur_des_options");
        int annee = voiture.getInt("annee");
        boolean garage_interieur = voiture.getBoolean("garage_interieur");
        boolean systeme_alarme = voiture.getBoolean("systeme_alarme");

        // declaration des variables de l'objet conducteur
        String date_de_naissance = conducteur.getString("date_de_naissance");
        String province = conducteur.getString("province");
        String ville = conducteur.getString("ville");
        String sexe = conducteur.getString("sexe");
        String date_fin_cours_de_conduite = conducteur.getString("date_fin_cours_de_conduite");
        boolean cours_de_conduite_reconnus_par_CAA = conducteur.getBoolean("cours_de_conduite_reconnus_par_CAA");
        boolean premier_contrat = conducteur.getBoolean("premier_contrat");





        float valInitilaVoit = 0; // valeur initiale du vehicule


        for (int j = 0; j < root.size(); j++) {

            JSONObject document = root.getJSONObject(j);
            if ((document.getString("modele").compareTo(modele) == 0)) {
                valInitilaVoit = document.getInt("valInit");
                System.out.println("La valeur initiale est: " + valInitilaVoit);
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
        DDN = formatAMJ.parse(date_de_naissance);

        // conversion de la date de fin du cours en format string pour un format Date
        java.util.Date DateFinCours;
        DateFinCours = formatAMJ.parse(date_fin_cours_de_conduite);

        System.out.println("La chaine de caractere represente : " + formatAMJ.format(DDN));



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
        ValRet = calculSoumission(durContrat, valInitilaVoit, valeur_des_options, burinage, 
                 garage_interieur, systeme_alarme, premier_contrat, ville, sexe, 
                 cours_de_conduite_reconnus_par_CAA, diffAgeJour, diffExpJour);

        System.out.println("Montant annuel : " + ValRet);
        mensualite = (float) ((ValRet + (ValRet * 0.015)) / 12);
        System.out.println("Mensualite : " + mensualite);



    } // fin main 

    /*
     * @fonction calculSoumission qui va calculer la valeur de la soumission a partir des regles
     * @retour : valeur soumission
     * @param : 
     */
    public static float calculSoumission(int durContrat, float valInitilaVoit, int valeur_des_options,
            String burinage, boolean garage_interieur, boolean systeme_alarme, boolean premier_contrat, 
            String ville, String sexe, boolean cours_de_conduite_reconnus_par_CAA, double diffAgeJour, 
            double diffExpJour) {

        // calcul de la soumission
        float valCumul = (float) (valInitilaVoit * 0.09); // valeur cumulee de la soumission
        float valRetour = 0;

        if (durContrat == 3) {
            valCumul -= ((valCumul * 15) / 100);
        }

        valCumul = (float) (valCumul + ((float) valeur_des_options * 0.10));

        if ((ville.compareTo("Montréal") == 0) || (ville.compareTo("Longueuil") == 0)) {
            valCumul += 200;
        }

        if (burinage.compareTo("Sherlock") == 0) {
            valCumul += 250;
        }
        if (sexe.compareTo("F") == 0) {
            valCumul -= 1000;
        }
        if (garage_interieur == true) {
            valCumul -= 500;
        }

        if (systeme_alarme == true) {
            valCumul -= 500;
        }

        if (cours_de_conduite_reconnus_par_CAA == true) {
            valCumul -= 100;
        }
        if ((diffAgeJour < (35 * 365)) && (sexe.compareTo("M") == 0)) {
            valCumul += 1000;

        }

        if (premier_contrat == true) {
            valCumul += 2000;
        }
        valRetour = valCumul;

        if (diffExpJour > (15 * 365)) {

            valCumul -= 400;
            valRetour = valCumul;
        }

        return valRetour;
    } // fin fonction calculSoumission
} // fin classe Calcul_Soumission

