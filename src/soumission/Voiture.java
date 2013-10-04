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
import net.sf.json.JSONArray;
/**
 *
 * @author Revold
 */
public class Voiture  {
    
    public static int prixDuVehicule(Soumission<ArrayList> soumission1) throws FileNotFoundException, IOException{
        int prix = 0;
        String modele = soumission1.getMarque();
        String marque = soumission1.getMarque();
        
        String jsonTxt = JsonParsing.loadFileIntoString("src/soumission/Json/voituresAdmissibles.json", "UTF-8");
        JSONArray root = (JSONArray) JSONSerializer.toJSON(jsonTxt);
         
        
        for (int i = 0; i<= root.size();i++){
            JSONObject document = root.getJSONObject(i);
            if ((document.getInt("annee") == soumission1.getAnnee())) { //Si on ajoute des années autre que 2014
                if ((document.getString("marque").compareTo(soumission1.getMarque()) == 0)) { //Si on ajoute des marques autre que "Porsche"
                    if ((document.getString("modele").compareTo(soumission1.getModele()) == 0)) {
                        prix = document.getInt("valInit");
                        i=root.size();//ferme la boucle
                        //System.out.println("La valeur initiale est: " + valInitilaVoit);
                    }
                }
            }
        }
        return prix;
    }
    
}
