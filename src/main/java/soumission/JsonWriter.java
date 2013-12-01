package soumission;

import java.io.FileWriter;
import java.io.IOException;
import net.sf.json.JSONObject;
import flexjson.JSONSerializer;
import org.apache.commons.math.util.MathUtils;

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

public class JsonWriter {

    public static void ecriture(boolean assurable, double total, double mensualite, String fichierSortie) {
        JSONObject obj = new JSONObject();
        obj.put("assurable", assurable);
        if (assurable) {
            obj.put("montant_annuel", MathUtils.round(total, 2));
            obj.put("mensualite", MathUtils.round(mensualite, 2));
        }

        try {
            FileWriter file = new FileWriter(fichierSortie);
            JSONSerializer json = new JSONSerializer();
            json.prettyPrint(true);
            json.serialize(obj, file);
            file.flush();
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}