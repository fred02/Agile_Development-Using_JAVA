package soumission;



import soumission.VehiculeStats;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import net.sf.json.JSONArray;
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

public class Statistique {
   
   private int statsTotalSoumission;
   private int statsTotalNonAssurable;
   private int statsTotalAssurable;
   private int statsTotalHomme;
   private int statsTotalFemme;
   private int statsTotalVehicule;
   private int statsTotalVoitureAssurable;
   private int statsTotalMotoAssurable;
   private ArrayList<VehiculeStats> statsVehiculeParMarque;
   
   public Statistique() throws FileNotFoundException, IOException{
       String StatistiqueEntree = "src/soumission/Json/StatistiqueSortie.json";
       String jsonTxt = JsonParsing.load_File_Into_String(StatistiqueEntree, "UTF-8");

        JSONObject rootStats = (JSONObject) JSONSerializer.toJSON(jsonTxt);
        
        statsTotalSoumission = rootStats.getInt("nombre_de_soumissions");
        statsTotalNonAssurable = rootStats.getInt("nombre_de_soumissions_non_assurables");
        statsTotalAssurable = rootStats.getInt("nombre_de_soumissions_assurables");
        statsTotalHomme = rootStats.getInt("nombre_de_soumissions_hommes");
        statsTotalFemme = rootStats.getInt("nombre_de_soumissions_femmes");
        statsTotalVehicule = rootStats.getInt("nombre_de_vehicules");
        statsTotalVoitureAssurable = rootStats.getInt("nombre_de_voitures_assurables");
        statsTotalMotoAssurable = rootStats.getInt("nombre_de_motos_assurables");
        
        ChargerVehiculeMarque(rootStats);
   
   }
   
   public void set_TotalAssurable() {
        statsTotalAssurable ++;
        statsTotalSoumission++;
   }
   
   public void set_TotalNonAssurable() {
        statsTotalNonAssurable ++;
        statsTotalSoumission++;
   }
   
   public void set_TotalHomme() {
        statsTotalHomme ++;
   }
   
   public void set_TotalFemme() {
        statsTotalFemme ++;
   }
   
   public void set_TotalVehicule(int valeur) {
        statsTotalVehicule = statsTotalVehicule + valeur;
   }
   
   public void set_TotalVoitureAssurable(int valeur) {
        statsTotalVoitureAssurable = statsTotalVoitureAssurable + valeur ;
        statsTotalVehicule = statsTotalVehicule + valeur;
   }
   
   public void set_TotalMotoAssurable(int valeur) {
        statsTotalMotoAssurable = statsTotalMotoAssurable + valeur ;
        statsTotalVehicule = statsTotalVehicule + valeur;
   }
   
   public void set_statsVehiculeParMarque(String nouvelleMarque) {
       boolean found = false; 
       for (int i = 0; i < statsVehiculeParMarque.size(); ++i) {
           if (statsVehiculeParMarque.get(i).marqueExistante().equals(nouvelleMarque)){
               statsVehiculeParMarque.get(i).incrementerLeVehicule();
               found = true;
           }
        }
       if(found == false){
           statsVehiculeParMarque.add(new VehiculeStats(nouvelleMarque));           
       }
   }
   
   public void set_endroitSauvegarder(boolean endroitFlag, String endroit) {
       if(endroitFlag == false){
           sauvegarder_statistique("src/soumission/Json/StatistiqueSortie.json");
       }else{
           sauvegarder_statistique(endroit);
       }
   }
   
   private void sauvegarder_statistique(String filePatch) {
        JSONObject fichierStats = new JSONObject();
        fichierStats.put("nombre_de_soumissions", statsTotalSoumission);
        fichierStats.put("nombre_de_soumissions_non_assurables", statsTotalNonAssurable);
        fichierStats.put("nombre_de_soumissions_assurables", statsTotalAssurable);
        fichierStats.put("nombre_de_soumissions_hommes", statsTotalHomme);
        fichierStats.put("nombre_de_soumissions_femmes", statsTotalFemme);
        fichierStats.put("nombre_de_vehicules", statsTotalVehicule);
        fichierStats.put("nombre_de_voitures_assurables", statsTotalVoitureAssurable);
        fichierStats.put("nombre_de_motos_assurables", statsTotalMotoAssurable);
        
        JSONArray arrayVehiculeParMarque = SauvegardeVehiculeMarque();
     
        fichierStats.put("vehicules_par_marque", (Object)arrayVehiculeParMarque);
        
        try {
            FileWriter file = new FileWriter(filePatch);
            flexjson.JSONSerializer json = new flexjson.JSONSerializer();
            json.prettyPrint(true);
            json.serialize(fichierStats, file);
            file.flush();
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
   }

    private JSONArray SauvegardeVehiculeMarque() {
        JSONArray statsVehiculeParMarqueArray = new JSONArray();
        for (int i = 0; i < statsVehiculeParMarque.size(); ++i) {
            JSONObject indiceMarque = new JSONObject();
            indiceMarque.put("marque", statsVehiculeParMarque.get(i).marqueExistante());
            indiceMarque.put("nombre", statsVehiculeParMarque.get(i).nombreParMarque());
            statsVehiculeParMarqueArray.add(indiceMarque); 
        }
        return statsVehiculeParMarqueArray;
    }

    private void ChargerVehiculeMarque(JSONObject rootStats) {
        JSONArray vehicule_JSON = rootStats.getJSONArray("vehicules_par_marque");
        statsVehiculeParMarque = new ArrayList<VehiculeStats>();
        for (int i = 0; i < vehicule_JSON.size(); ++i) {
            statsVehiculeParMarque.add(new VehiculeStats((vehicule_JSON.getJSONObject(i).getString("marque")),
                                                        (vehicule_JSON.getJSONObject(i).getInt("nombre")))); 
        }         
    }
    
}
