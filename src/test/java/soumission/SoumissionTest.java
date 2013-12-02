/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soumission;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Calendar;
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
public class SoumissionTest {
    
    public SoumissionTest() {
    }
    private JSONObject jSoumission;
    private JSONObject jVoiture;
    private JSONArray jVoitures;
    private JSONObject jMoto;
    private JSONArray jMotos;
    private JSONObject jConducteur;
    
    private Voiture voiture;
    private Moto moto;
    private Conducteur conducteur;
    
    private Soumission soumission1;
    private Soumission soumission2;
    
    @Before
    public void setUp() throws NullPointerException, FileNotFoundException, IOException{
         
        jVoiture=new JSONObject();
        jVoiture.put("annee",2014);
        jVoiture.put("marque","Porsche");
        jVoiture.put("modele","911 Turbo");
        jVoiture.put("valeur_des_options",8000);
        jVoiture.put("burinage","PROACTIF");
        jVoiture.put("garage_interieur",true);
        jVoiture.put("systeme_alarme",true);
        
        jVoitures=new JSONArray();
        jVoitures.add(jVoiture);
        
        voiture=new Voiture(2014,"Porsche","911 Turbo",8000,"PROACTIF",true,true,170000);
        
        jMoto=new JSONObject();
        jMoto.put("annee",2013);
        jMoto.put("marque","Ducati");
        jMoto.put("modele","Superbike 1199 Panigale R");
        jMoto.put("valeur_des_options",1000);
        jMoto.put("burinage","PROACTIF");
        jMoto.put("garage_interieur",false);
        jMoto.put("systeme_alarme",false);
        
        moto=new Moto(2013,"Ducati","Superbike 1199 Panigale R",1000,"PROACTIF",false,false,32000,1198);
        
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
        
        conducteur=new Conducteur("1980-01-15","Québec","Montréal",'M', "2000-12-01", true, false, true);
        
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
     * Test of get_Voiture method, of class Soumission.
     */
    @Test
    public void testGet_Voiture() {
        System.out.println("get_Voiture");
        int pos = 0;
        Voiture expResult = new Voiture(2014,"Porsche","911 Turbo",8000,"PROACTIF",true,true,170000);
        Voiture result = soumission1.get_Voiture(pos);
        System.out.print(result);
        assertTrue(expResult.equals(result));
    }

    /**
     * Test of get_Voitures method, of class Soumission.
     */
    @Test
    public void testGet_Voitures() {
        System.out.println("get_Voitures");
        Voiture[] expResult=new Voiture[1];
        expResult[0] = new Voiture(2014,"Porsche","911 Turbo",8000,"PROACTIF",true,true,170000);
        Voiture[] result = soumission1.get_Voitures();
        assertTrue(expResult[0].equals(result[0]));
    }

    /**
     * Test of get_Nb_Voitures method, of class Soumission.
     */
    @Test
    public void testGet_Nb_Voitures() {
        System.out.println("get_Nb_Voitures");
        int expResult = 1;
        int result = soumission1.get_Nb_Voitures();
        assertEquals(expResult, result);
    }

    /**
     * Test of get_Moto method, of class Soumission.
     */
    @Test
    public void testGet_Moto() {
        System.out.println("get_Moto");
        int pos = 0;
        Moto expResult = new Moto(2013,"Ducati","Superbike 1199 Panigale R",1000,"PROACTIF",false,false,32000,1198);
        Moto result = soumission1.get_Moto(pos);
        assertTrue(expResult.equals(result));
    }

    /**
     * Test of get_Motos method, of class Soumission.
     */
    @Test
    public void testGet_Motos() {
        System.out.println("get_Motos");
        Moto[] expResult = new Moto[1];
        expResult[0] = new Moto(2013,"Ducati","Superbike 1199 Panigale R",1000,"PROACTIF",false,false,32000,1198);
        Moto[] result = soumission1.get_Motos();
        assertTrue(expResult[0].equals(result[0]));
    }

    /**
     * Test of get_Nb_Motos method, of class Soumission.
     */
    @Test
    public void testGet_Nb_Motos() {
        System.out.println("get_Nb_Motos");
        int expResult = 1;
        int result = soumission1.get_Nb_Motos();
        assertEquals(expResult, result);
    }

    /**
     * Test of get_Conducteur method, of class Soumission.
     */
    @Test
    public void testGet_Conducteur() {
        System.out.println("get_Conducteur");
        Conducteur expResult = new Conducteur("1980-01-15","Québec","Montréal",'M', "2000-12-01", true, false, true);
        Conducteur result = soumission1.get_Conducteur();
        assertTrue(expResult.equals(result));
    }

    /**
     * Test of get_Duree_contrat method, of class Soumission.
     */
    @Test
    public void testGet_Duree_contrat() {
        System.out.println("get_Duree_contrat");
        int expResult = 2;
        int result = soumission1.get_Duree_contrat();
        assertEquals(expResult, result);
    }

    /**
     * Test of get_Assurable method, of class Soumission.
     */
    @Test
    public void testGet_Assurable() {
        System.out.println("get_Assurable");
        boolean expResult = true;
        boolean result = soumission1.get_Assurable();
        assertEquals(expResult, result);
    }

    /**
     * Test of get_Date_debut method, of class Soumission.
     */
    @Test
    public void testGet_Date_debut() {
        System.out.println("get_Date_debut");
        Calendar expResult = DateParsing.stringToCalendar("2014-01-04");
        Calendar result = soumission1.get_Date_debut();
        assertEquals(expResult, result);
    }
}