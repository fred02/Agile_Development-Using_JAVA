package soumission;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;
import net.sf.json.JSONArray;

public class Moto extends Vehicule{
       
    private double cc;
    
    public Moto(JSONObject json,int valeur_Initiale_1,double cc_1){
        super(json,valeur_Initiale_1);
        cc=cc_1;
    }
    
    public double getCc() {
        return cc;
    }
    
    public static int trouverVehicule(int annee,String marque,String modele) throws FileNotFoundException, IOException{
        int indice=-1;
        
        String jsonTxt = JsonParsing.loadFileIntoString("src/soumission/Json/vehiculesAdmissibles.json", "UTF-8");
        JSONObject root = (JSONObject) JSONSerializer.toJSON(jsonTxt);
        JSONArray motos = root.getJSONArray("motos");
        
        for (int i = 0; i<motos.size();i++){
            JSONObject document = motos.getJSONObject(i);
            
            if ((document.getInt("annee") == annee)) {
                if ((document.getString("marque").compareTo(marque) == 0)) {
                    if ((document.getString("modele").compareTo(modele) == 0)) {
                        indice = i;
                        i=motos.size();
                    }
                }
            } 
        }
        return indice;
    }
    public static int valeurVehicule(int indice) throws FileNotFoundException, IOException{

        String jsonTxt = JsonParsing.loadFileIntoString("src/soumission/Json/vehiculesAdmissibles.json", "UTF-8");
        JSONObject root = (JSONObject) JSONSerializer.toJSON(jsonTxt);
        JSONArray motos = root.getJSONArray("motos");
        
        JSONObject document = motos.getJSONObject(indice);
        
        return document.getInt("valInit");
    }
    
    public static double ccMoto(int indice) throws FileNotFoundException, IOException{
        
        String jsonTxt = JsonParsing.loadFileIntoString("src/soumission/Json/vehiculesAdmissibles.json", "UTF-8");
        JSONObject root = (JSONObject) JSONSerializer.toJSON(jsonTxt);
        JSONArray motos = root.getJSONArray("motos");

        JSONObject document = motos.getJSONObject(indice);

        return document.getDouble("CC");
    }

}
