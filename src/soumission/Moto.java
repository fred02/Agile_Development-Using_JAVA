/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soumission;

/**
 *
 * @author fred02
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;
import net.sf.json.JSONArray;

public class Moto  {
       
    public static int prixDuVehicule(Soumission<ArrayList> soumission1) throws FileNotFoundException, IOException{
        int prix = -1;
        
        String jsonTxt = JsonParsing.loadFileIntoString("src/soumission/Json/motosAdmissibles.json", "UTF-8");
        JSONArray rootMotos = (JSONArray) JSONSerializer.toJSON(jsonTxt);
        
        for (int i = 0; i<rootMotos.size();i++){
            JSONObject document = rootMotos.getJSONObject(i);
            if ((document.getInt("annee") == soumission1.getAnnee())) { //Si on ajoute des années autre que 2014
                if ((document.getString("marque").compareTo(soumission1.getMarque()) == 0)) { //Si on ajoute des marques autre que "Porsche"
                    if ((document.getString("modele").compareTo(soumission1.getModele()) == 0)) {
                        prix = document.getInt("valInit");
                        i=rootMotos.size();//ferme la boucle
                    }
                }
            }
        }
        return prix;
    }
    
}
