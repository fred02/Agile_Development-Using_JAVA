package soumission;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Cours: INF2015 Enseignant: Jacques Berger
 *
 * Projet pour DDC #1
 *
 * Equipe 8 Etudiants:
 *
 * Gabriel Jourdenais-Hamel JOUG08108901 Fahd Kacem KACF21038103 Jonathan Drolet
 * Vince Lavoie
 */

// syntaxe sur la ligne de commande une fois le projet compilé:
// java -jar dist/Projet-Soumission_Assurance.jar IN/input1.json src/soumission/json/nom_de_votre_choix.json
public class Index {

    static String fichierEcriture;

    public static void main(String[] args) throws FileNotFoundException, IOException {
        fichierEcriture = args[1];

        Soumission<ArrayList> soumission1 = new Soumission<ArrayList>(JsonReader.Load_File(args[0]));

        if (soumission1.get_Assurable() && tester_Duree_Contrat(soumission1.get_Duree_contrat())) {
            double total = calculer_Prix_Soumission(soumission1);
            double mensualite = calculer_Mensualite(total);
            JsonWriter.ecriture(true, total, mensualite, fichierEcriture);
        } else {
            JsonWriter.ecriture(false, 0, 0, fichierEcriture);
        }

    }

    public static boolean tester_Duree_Contrat(int duree) {

        if (duree >= 1 && duree <= 3) {
            return true;
        } else {
            return false;
        }
    }

    public static double calculer_Pourcentage_DeBase(int age, char sexe) {
        double pourcentage = 0;

        if (sexe == 'F' || sexe == 'f') {

            if (age >= 21 && age <= 40) {
                pourcentage = 0.11;
            }
            if (age >= 41 && age <= 65) {
                pourcentage = 0.09;
            }
            if (age >= 66 && age <= 75) {
                pourcentage = 0.155;
            }
        }
        if (sexe == 'M' || sexe == 'm') {

            if (age >= 25 && age <= 35) {
                pourcentage = 0.15;
            }
            if (age >= 36 && age <= 60) {
                pourcentage = 0.12;
            }
            if (age >= 61 && age <= 75) {
                pourcentage = 0.135;
            }
        }

        return pourcentage;
    }

    public static double calculer_Prix_Soumission(Soumission<ArrayList> soumission1) throws FileNotFoundException, IOException {
        double total = 0;
        Conducteur conducteur = soumission1.get_Conducteur();
        for (int i = 0; i < soumission1.get_Nb_Voitures(); i++) {
            Voiture voiture = soumission1.get_Voiture(i);
            total += calculer_Prix_Vehicule(conducteur, voiture, soumission1.get_Duree_contrat());
        }
        for (int i = 0; i < soumission1.get_Nb_Motos(); i++) {
            Moto moto = soumission1.get_Moto(i);
            total += calculer_Prix_Vehicule(conducteur, moto, soumission1.get_Duree_contrat());
        }
        //System.out.println(total);
        return total;
    }

    public static double calculer_Prix_Vehicule(Conducteur conducteur, Vehicule vehicule, int duree_Contrat) throws FileNotFoundException, IOException {
        double total = 0;

        int prixDuVehicule = vehicule.get_Valeur_Initiale();
        double pourcent = calculer_Pourcentage_DeBase(conducteur.get_Age(), conducteur.get_Sexe());
        if (vehicule instanceof Moto) {
            pourcent += 0.14;
        }

        if (duree_Contrat == 3) {
            prixDuVehicule *= 0.85;
        }
        total = (prixDuVehicule * pourcent);
        total += (vehicule.get_Valeur_des_options() * 0.10);

        if (conducteur.get_Ville().equalsIgnoreCase("Montréal") || conducteur.get_Ville().equalsIgnoreCase("Longueuil")) {
            total += 200;
        }
        if (vehicule.get_Burinage().equalsIgnoreCase("Sherlock")) {
            total -= 250;
        }

        if (vehicule.isGarage_interieur()) {
            total -= 500;
        }
        if (vehicule.isSysteme_alarme()) {
            total -= 500;
        }
        if (conducteur.isCours_de_conduite_reconnus_par_CAA()) {
            total -= 100;
        }

        if (conducteur.isPremier_contrat()) {
            total += 2000;
        }
        if (conducteur.get_Experience() > 15) {
            total -= 400;
        }

        if (vehicule.get_Valeur_Initiale() > 500000) {
            total += 2500;
        }

        if (vehicule instanceof Moto) {
            if (((Moto) vehicule).getCc() > 1100) {
                total += 1000;
            }
        }

        if (conducteur.isMembre_oiq()) {
            total *= 0.9;
        }
        return total;
    }

    public static double calculer_Mensualite(double total) {
        double mensualite;
        mensualite = (total * 1.015) / 12;

        return mensualite;
    }
}