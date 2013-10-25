package soumission;

import java.io.FileNotFoundException;
import java.io.IOException;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

public class Voiture extends Vehicule{
       
    public Voiture(JSONObject json,int valeur_Initiale_1){
        super(json,valeur_Initiale_1);
    }
    
    public static int trouverVehicule(int annee,String marque,String modele) throws FileNotFoundException, IOException{
        int indice=-1;
        
        String jsonTxt = JsonParsing.loadFileIntoString("src/soumission/Json/vehiculesAdmissibles.json", "UTF-8");
        JSONObject root = (JSONObject) JSONSerializer.toJSON(jsonTxt);
        JSONArray voitures = root.getJSONArray("voitures");
        
        for (int i = 0; i<voitures.size();i++){
            JSONObject document = voitures.getJSONObject(i);
            
            if ((document.getInt("annee") == annee)) {
                if ((document.getString("marque").compareTo(marque) == 0)) {
                    if ((document.getString("modele").compareTo(modele) == 0)) {
                        indice = i;
                        i=voitures.size();
                    }
                }
            } 
        }
        return indice;
    }
    public static int valeurVehicule(int indice) throws FileNotFoundException, IOException{

        String jsonTxt = JsonParsing.loadFileIntoString("src/soumission/Json/vehiculesAdmissibles.json", "UTF-8");
        JSONObject root = (JSONObject) JSONSerializer.toJSON(jsonTxt);
        JSONArray voitures = root.getJSONArray("voitures");
        
        JSONObject document = voitures.getJSONObject(indice);
        
        return document.getInt("valInit");
    }
    
}


