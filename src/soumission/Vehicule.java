package soumission;

import java.io.FileNotFoundException;
import java.io.IOException;
import net.sf.json.JSONObject;

/**
 * Cours: INF2015 Enseignant: Jacques Berger
 *
 * Projet pour DDC #1
 *
 * Equipe 8
 * Etudiants:
 * 
 * Gabriel Jourdenais-Hamel JOUG08108901
 * Fahd Kacem               KACF21038103
 * Jonathan Drolet    
 * Vince Lavoie    
 */

public class Vehicule {

    protected int annee;
    protected String marque;
    protected String modele;
    protected int valeur_des_options;
    protected String burinage;
    protected boolean garage_interieur;
    protected boolean systeme_alarme;
    protected int valeur_Initiale;

    public Vehicule() {
        this(0, "", "", 0, "", false, false, 0);
    }

    public Vehicule(int annee_1, String marque_1, String modele_1, int valeur_des_options_1,
            String burinage_1, boolean garage_interieur_1, boolean systeme_alarme_1, int valeur_Initiale_1) {
        annee = annee_1;
        marque = marque_1;
        modele = modele_1;
        valeur_des_options = valeur_des_options_1;
        burinage = burinage_1;
        garage_interieur = garage_interieur_1;
        systeme_alarme = systeme_alarme_1;
        valeur_Initiale = valeur_Initiale_1;
    }

    public Vehicule(JSONObject json, int valeur_Initiale_1) {
        annee = json.getInt("annee");
        marque = json.getString("marque");
        modele = json.getString("modele");
        valeur_des_options = json.getInt("valeur_des_options");
        burinage = json.getString("burinage");
        garage_interieur = json.getBoolean("garage_interieur");
        systeme_alarme = json.getBoolean("systeme_alarme");
        valeur_Initiale = valeur_Initiale_1;
    }

    public int get_Annee() {
        return annee;
    }

    public String get_Marque() {
        return marque;
    }

    public String get_Modele() {
        return modele;
    }

    public int get_Valeur_des_options() {
        return valeur_des_options;
    }

    public String get_Burinage() {
        return burinage;
    }

    public boolean isGarage_interieur() {
        return garage_interieur;
    }

    public boolean isSysteme_alarme() {
        return systeme_alarme;
    }

    public int get_Valeur_Initiale() {
        return valeur_Initiale;
    }

    public static int trouver_Vehicule(int annee, String marque, String modele) throws FileNotFoundException, IOException {
        return -1;
    }

    public static int valeur_Vehicule(int indice) throws FileNotFoundException, IOException {
        return 0;
    }
}
