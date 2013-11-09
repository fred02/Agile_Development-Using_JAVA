/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soumission;

import java.io.FileWriter;
import java.io.IOException;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;
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

public class Liste {
    
    public static void Print(String fichierEcriture) throws IOException{
        
        String json_Txt = JsonParsing.load_File_Into_String("src/soumission/Json/vehiculesAdmissibles.json", "UTF-8");
        JSONObject root = (JSONObject) JSONSerializer.toJSON(json_Txt);
        JSONArray voitures = root.getJSONArray("voitures");
        JSONArray motos = root.getJSONArray("motos");
      
        motos = SortedMotos(motos);
        voitures = SortedVoitures(voitures);
        
        JSONObject vehicule = Merge(motos,voitures);
        ToJSON(vehicule,fichierEcriture);
    }
    
    private static JSONArray SortedMotos(JSONArray motos){
       JSONArray sortedMotos = new JSONArray();
        
        for (int i = 0; i<motos.size();i++){
            JSONObject temp = new JSONObject();
            temp.put("marque", (motos.getJSONObject(i)).getString("marque"));
            temp.put("modele", (motos.getJSONObject(i)).getString("modele"));
            temp.put("annee", (motos.getJSONObject(i)).getString("annee"));
            temp.put("type", "moto");
            
            sortedMotos.add(i, temp);
        }
        
        return sortedMotos;
    } 
    
    private static JSONArray SortedVoitures(JSONArray voitures){
        JSONArray sortedVoitures = new JSONArray();
        
        for (int i = 0; i<voitures.size();i++){
            JSONObject temp = new JSONObject();
            temp.put("marque", (voitures.getJSONObject(i)).getString("marque"));
            temp.put("modele", (voitures.getJSONObject(i)).getString("modele"));
            temp.put("annee", (voitures.getJSONObject(i)).getString("annee"));
            temp.put("type", "voiture");
            
            sortedVoitures.add(i, temp);
        }
        return sortedVoitures;
    } 
    
    private static JSONObject Merge(JSONArray motos, JSONArray voitures){
        JSONArray vehicule = new JSONArray();
        JSONObject objVehicule = new JSONObject();

        vehicule.addAll(voitures);
        vehicule.addAll(motos);

        objVehicule.put("assurable", vehicule);
        return objVehicule;
    }
    
    private static void ToJSON(JSONObject vehicule, String fichierEcriture){
              
        try {
            FileWriter file = new FileWriter(fichierEcriture);
            flexjson.JSONSerializer json = new flexjson.JSONSerializer();
            json.prettyPrint(true);
            json.include("assurable").serialize(vehicule, file);
            file.flush();
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
            
}
