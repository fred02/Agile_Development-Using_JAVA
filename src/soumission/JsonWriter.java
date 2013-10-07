/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soumission;

import java.io.FileWriter;
import java.io.IOException;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import flexjson.JSONSerializer;
import org.apache.commons.math.util.MathUtils;

/**
 *
 * @author SKUD
 */
public class JsonWriter {

    /**
     * @param args the command line arguments
     */
    public static void ecriture(boolean assurable, double total, double mensualite, String fichierSortie){
        JSONObject obj = new JSONObject();
	obj.put("assurable", assurable);
        if(assurable)
        {
            obj.put("montant_annuel",MathUtils.round(total,2));
            obj.put("mensualite",MathUtils.round(mensualite,2));
        }
 
	try {
		FileWriter file = new FileWriter(fichierSortie);
                JSONSerializer json = new JSONSerializer();
                json.prettyPrint(true);
		json.serialize(obj,file);
		file.flush();
		file.close();
 
	} catch (IOException e) {
		e.printStackTrace();
	}
 
	//System.out.print(obj);
 
    }
}