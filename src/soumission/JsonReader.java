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
           
            soumission1 = new Soumission<ArrayList>();
       
            String jsonTxt = JsonParsing.loadFileIntoString("src/soumission/Json/fichierEntree1.json", "UTF-8");

            JSONObject root = (JSONObject) JSONSerializer.toJSON(jsonTxt);
            
            JSONObject voiture = root.getJSONObject("voiture");
            JSONObject conducteur = root.getJSONObject("conducteur");
            //JSONObject duree_contrat = root.getJSONObject("duree_contrat");
            
            soumission1.setAnnee(voiture.getInt("annee"));
            soumission1.setMarque(voiture.getString("marque"));
            soumission1.setModele(voiture.getString("modele"));
            soumission1.setValeur_des_options(voiture.getInt("valeur_des_options"));
            soumission1.setBurinage(voiture.getString("burinage"));
            soumission1.setGarage_interieur(voiture.getBoolean("garage_interieur"));
            soumission1.setSysteme_alarme(voiture.getBoolean("garage_interieur"));
            
            soumission1.setDate_de_naissance(conducteur.getString("date_de_naissance"));
            soumission1.setProvince(conducteur.getString("province"));
            soumission1.setVille(conducteur.getString("ville"));
            soumission1.setSexe(conducteur.getString("sexe").charAt(0));
            soumission1.setDate_fin_cours_de_conduite(conducteur.getString("date_fin_cours_de_conduite"));
            soumission1.setCours_de_conduite_reconnus_par_CAA(conducteur.getBoolean("cours_de_conduite_reconnus_par_CAA"));
            soumission1.setPremier_contrat(conducteur.getBoolean("premier_contrat"));
            
            soumission1.setDuree_contrat(root.getInt("duree_contrat"));
            
            return soumission1;
    }
}
