/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soumission;

import soumissionAss.Soumission;
import soumissionAss.JsonReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gabriel
 */
public class JsonReaderTest extends JsonReader{
    
    public JsonReaderTest() {
    }
    private JSONObject jSoumission;
    private JSONObject jVoiture;
    private JSONArray jVoitures;
    private JSONObject jMoto;
    private JSONArray jMotos;
    private JSONObject jConducteur;
    
    private Soumission soumission1;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws FileNotFoundException, IOException{
        jVoiture=new JSONObject();
        jVoiture.put("annee",2013);
        jVoiture.put("marque","Porsche");
        jVoiture.put("modele","918 Spyder");
        jVoiture.put("valeur_des_options",8000);
        jVoiture.put("burinage","PROACTIF");
        jVoiture.put("garage_interieur",true);
        jVoiture.put("systeme_alarme",true);
        
        jVoitures=new JSONArray();
        jVoitures.add(jVoiture);
        
        jMoto=new JSONObject();
        jMoto.put("annee",2013);
        jMoto.put("marque","Ducati");
        jMoto.put("modele","Superbike 1199 Panigale R");
        jMoto.put("valeur_des_options",1000);
        jMoto.put("burinage","PROACTIF");
        jMoto.put("garage_interieur",false);
        jMoto.put("systeme_alarme",false);
        
        jMotos=new JSONArray();
        jMotos.add(jMoto);
        
        jConducteur=new JSONObject();
        jConducteur.put("date_de_naissance","1980-01-15");
        jConducteur.put("province","Québec");     
        jConducteur.put("ville", "Montréal");
        jConducteur.put("sexe","M");
        jConducteur.put("date_fin_cours_de_conduite", "2000-12-01");
        jConducteur.put("cours_de_conduite_reconnus_par_CAA", true);
        jConducteur.put("premier_contrat", false);
	jConducteur.put("membre_oiq", true);
        
        jSoumission=new JSONObject();
        jSoumission.put("voitures",jVoitures);
        jSoumission.put("motos",jMotos);
        jSoumission.put("conducteur",jConducteur);
        jSoumission.put("duree_contrat",2);
        jSoumission.put("date_debut","2014-01-04");
        
        soumission1=new Soumission(jSoumission);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Load_File method, of class JsonReader.
     */
    @Test
    public void testLoad_File() throws FileNotFoundException, IOException{
        System.out.println("Load_File");
        String fichierEntree = "src/test/java/soumission/testEnt1.json";
        Soumission result = JsonReader.Load_File(fichierEntree);
        assertTrue(soumission1.equals(result));
    }
}