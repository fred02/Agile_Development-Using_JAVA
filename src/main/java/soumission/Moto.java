package soumission;

import java.io.FileNotFoundException;
import java.io.IOException;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;
import net.sf.json.JSONArray;

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

public class Moto extends Vehicule {

    private double cc;

    public Moto(int annee_1, String marque_1, String modele_1, int valeur_des_options_1,
            String burinage_1, boolean garage_interieur_1, boolean systeme_alarme_1, int valeur_Initiale_1,double cc_1) {
        super(annee_1,marque_1,modele_1,valeur_des_options_1,burinage_1,garage_interieur_1,systeme_alarme_1,valeur_Initiale_1);
        cc = cc_1;
    }
    
    public Moto(JSONObject json, int valeur_Initiale_1, double cc_1) {
        super(json, valeur_Initiale_1);
        cc = cc_1;
    }

    public double getCc() {
        return cc;
    }

    public static int trouver_Vehicule(int annee, String marque, String modele) throws FileNotFoundException, IOException {
        int indice = -1;

        String json_Txt = JsonParsing.load_File_Into_String("src/main/java/soumission/Json/vehiculesAdmissibles.json", "UTF-8");
        JSONObject root = (JSONObject) JSONSerializer.toJSON(json_Txt);
        JSONArray motos = root.getJSONArray("motos");

        for (int i = 0; i < motos.size(); i++) {
            JSONObject document = motos.getJSONObject(i);

            if ((document.getInt("annee") == annee)) {
                if ((document.getString("marque").compareTo(marque) == 0)) {
                    if ((document.getString("modele").compareTo(modele) == 0)) {
                        indice = i;
                        i = motos.size();
                    }
                }
            }
        }
        return indice;
    }

    public static int valeur_Vehicule(int indice) throws FileNotFoundException, IOException {

        String json_Txt = JsonParsing.load_File_Into_String("src/main/java/soumission/Json/vehiculesAdmissibles.json", "UTF-8");
        JSONObject root = (JSONObject) JSONSerializer.toJSON(json_Txt);
        JSONArray motos = root.getJSONArray("motos");

        JSONObject document = motos.getJSONObject(indice);

        return document.getInt("valInit");
    }

    public static double cc_Moto(int indice) throws FileNotFoundException, IOException {

        String json_Txt = JsonParsing.load_File_Into_String("src/main/java/soumission/Json/vehiculesAdmissibles.json", "UTF-8");
        JSONObject root = (JSONObject) JSONSerializer.toJSON(json_Txt);
        JSONArray motos = root.getJSONArray("motos");

        JSONObject document = motos.getJSONObject(indice);

        return document.getDouble("CC");
    }
    
    public boolean equals(Moto moto){
        return super.equals(moto)&&cc==moto.cc;
    }
}
