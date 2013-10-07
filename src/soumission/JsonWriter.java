/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soumission;

import java.io.FileWriter;
import java.io.IOException;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

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
	obj.put("montant_annuel", total);
        obj.put("mensualite", mensualite);
 
 
	try {
 
		FileWriter file = new FileWriter(fichierSortie);
		file.write(obj.toString());
		file.flush();
		file.close();
 
	} catch (IOException e) {
		e.printStackTrace();
	}
 
	System.out.print(obj);
 
    }
}