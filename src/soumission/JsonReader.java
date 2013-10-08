/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soumission;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;
import java.text.SimpleDateFormat;

/**
 *
 * @author Revold
 */
public class JsonReader {
    
    public static Soumission<ArrayList> soumission1;
    
        public static Soumission<ArrayList> LoadFile(String fichierEntree)  throws FileNotFoundException, IOException {
           
            String jsonTxt = JsonParsing.loadFileIntoString(fichierEntree, "UTF-8");

            JSONObject root = (JSONObject) JSONSerializer.toJSON(jsonTxt);
            
            soumission1 = new Soumission<ArrayList>(root);
            
            return soumission1;
    }
}
