package soumission;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;



/**
 * Cours: INF2015 Enseignant: Jacques Berger
 *
 * Projet pour DDC #1
 *
 * Equipe 8 Etudiants:
 *
 * Gabriel Jourdenais-Hamel JOUG08108901 
 * Fahd Kacem               KACF21038103 
 * Jonathan Drolet          DROJ13078506
 * Vincent Lavoie           LAVV07068909
 */


public class Soumission<T extends ArrayList> {

    private Voiture voitures[];
    private Moto motos[];
    private Conducteur conducteur;
    private int duree_contrat;
    private String date_debut;
    private boolean assurable;

    public Soumission(JSONObject json) throws FileNotFoundException, IOException {

        JSONArray voitures_JSON = json.getJSONArray("voitures");
        JSONArray motos_JSON = json.getJSONArray("motos");
        JSONObject conducteur_JSON = json.getJSONObject("conducteur");

        assurable = true;
        boolean assureLuxe =true;
        voitures = new Voiture[voitures_JSON.size()];
        for (int i = 0; i < voitures_JSON.size(); ++i) {
            int annee = (voitures_JSON.getJSONObject(i)).getInt("annee");
            String marque = (voitures_JSON.getJSONObject(i)).getString("marque");
            String modele = (voitures_JSON.getJSONObject(i)).getString("modele");
            int indice; 
            int valeur_Init = 0;

            if ((indice = Voiture.trouver_Vehicule(annee, marque, modele)) >= 0) {
                valeur_Init = Voiture.valeur_Vehicule(indice);
            } else {
                assurable = false;
            }
            voitures[i] = new Voiture(voitures_JSON.getJSONObject(i), valeur_Init);
            assureLuxe = voitureDeLuxe (voitures[i]);
            if (assureLuxe == false) {
                assurable = false;
            }
        }

        motos = new Moto[motos_JSON.size()];
        for (int j = 0; j < motos_JSON.size(); ++j) {
            int annee = (motos_JSON.getJSONObject(j)).getInt("annee");
            String marque = (motos_JSON.getJSONObject(j)).getString("marque");
            String modele = (motos_JSON.getJSONObject(j)).getString("modele");
            int indice;
            int valeur_Init = 0;
            double cc = 0;

            if ((indice = Moto.trouver_Vehicule(annee, marque, modele)) >= 0) {
                valeur_Init = Moto.valeur_Vehicule(indice);
                cc = Moto.cc_Moto(indice);
            } else {
                assurable = false;
            }
            motos[j] = new Moto(motos_JSON.getJSONObject(j), valeur_Init, cc);
        }

        conducteur = new Conducteur(conducteur_JSON);

        duree_contrat = json.getInt("duree_contrat");
        
        date_debut = json.getString("date_debut");

        assurable = assurable && Conducteur.assurable(conducteur);
        
        
    }

    public Soumission(Soumission<ArrayList> soumission) {

        voitures = soumission.voitures;

        motos = soumission.motos;

        conducteur = soumission.conducteur;

        duree_contrat = soumission.duree_contrat;
        
        date_debut = soumission.date_debut;

        assurable = soumission.assurable;
    }

   private static boolean voitureDeLuxe (Vehicule vehicule) {
         
        boolean assure =true ;
        int valeur = vehicule.get_Valeur_Initiale();
        
        if ( (valeur > 1000000  && (!(vehicule.isGarage_interieur()) || !(vehicule.isSysteme_alarme())) ))
        {
            assure = false;
        }
        
        return assure;      
    }
   
    public Voiture get_Voiture(int pos) {
        return voitures[pos];
    }

    public Voiture[] get_Voitures() {
        return voitures;
    }

    public int get_Nb_Voitures() {
        return voitures.length;
    }

    public Moto get_Moto(int pos) {
        return motos[pos];
    }

    public Moto[] get_Motos() {
        return motos;
    }

    public int get_Nb_Motos() {
        return motos.length;
    }

    public Conducteur get_Conducteur() {
        return conducteur;
    }

    public int get_Duree_contrat() {
        return duree_contrat;
    }

    public boolean get_Assurable() {
        return assurable;
    }
    
    public Calendar get_Date_debut() {
        Calendar date = DateParsing.stringToCalendar(date_debut);
        return date;
    }
}
