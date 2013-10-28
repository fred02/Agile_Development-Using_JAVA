package soumission;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
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
public class JsonReader {

    public static Soumission<ArrayList> soumission1;

    public static Soumission<ArrayList> Load_File(String fichierEntree) throws FileNotFoundException, IOException {

        String jsonTxt = JsonParsing.load_File_Into_String(fichierEntree, "UTF-8");

        JSONObject root = (JSONObject) JSONSerializer.toJSON(jsonTxt);

        // création d'un Objet Soumission à partir de la chaine lue du fichier Json
        soumission1 = new Soumission<ArrayList>(root);


        return soumission1;
    }
}
