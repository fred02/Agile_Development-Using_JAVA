package soumission;

import java.io.FileNotFoundException;
import java.io.IOException;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

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

public class Voiture extends Vehicule {

    public Voiture(JSONObject json, int valeur_Initiale_1) {
        super(json, valeur_Initiale_1);
    }

    public static int trouver_Vehicule(int annee, String marque, String modele) throws FileNotFoundException, IOException {
        int indice = -1;

        String json_Txt = JsonParsing.load_File_Into_String("src/soumission/Json/vehiculesAdmissibles.json", "UTF-8");
        JSONObject root = (JSONObject) JSONSerializer.toJSON(json_Txt);
        JSONArray voitures = root.getJSONArray("voitures");

        for (int i = 0; i < voitures.size(); i++) {
            JSONObject document = voitures.getJSONObject(i);

            if ((document.getInt("annee") == annee)) {
                if ((document.getString("marque").compareTo(marque) == 0)) {
                    if ((document.getString("modele").compareTo(modele) == 0)) {
                        indice = i;
                        i = voitures.size();
                    }
                }
            }
        }
        return indice;
    }

    public static int valeur_Vehicule(int indice) throws FileNotFoundException, IOException {

        String json_Txt = JsonParsing.load_File_Into_String("src/soumission/Json/vehiculesAdmissibles.json", "UTF-8");
        JSONObject root = (JSONObject) JSONSerializer.toJSON(json_Txt);
        JSONArray voitures = root.getJSONArray("voitures");

        JSONObject document = voitures.getJSONObject(indice);

        return document.getInt("valInit");
    }
}
