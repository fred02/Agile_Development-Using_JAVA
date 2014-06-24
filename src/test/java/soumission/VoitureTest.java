/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soumission;

import soumissionAss.Voiture;
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
public class VoitureTest {
    
    public VoitureTest() {
    }
    JSONObject jVoiture;
    Voiture voiture1;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        jVoiture=new JSONObject();
        jVoiture.put("annee",2014);
        jVoiture.put("marque","Porsche");
        jVoiture.put("modele","911 Turbo");
        jVoiture.put("valeur_des_options",8000);
        jVoiture.put("burinage","PROACTIF");
        jVoiture.put("garage_interieur",true);
        jVoiture.put("systeme_alarme",true);
        voiture1=new Voiture(jVoiture,170000);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testVehicule(){
        System.out.println("Vehicule");
        Voiture voiture2=new Voiture(2014,"Porsche","911 Turbo",8000,"PROACTIF",true,true,170000);
        assertNotNull(voiture2);
        assertTrue(voiture1.equals(voiture2));
    }

    /**
     * Test of trouver_Vehicule method, of class Voiture.
     */
    @Test
    public void testTrouver_Vehicule() throws Exception {
        System.out.println("trouver_Vehicule");
        int annee = 2014;
        String marque = "Porsche";
        String modele = "911 Turbo";
        int expResult = 13;
        int result = Voiture.trouver_Vehicule(annee, marque, modele);
        assertEquals(expResult, result);
    }

    /**
     * Test of valeur_Vehicule method, of class Voiture.
     */
    @Test
    public void testValeur_Vehicule() throws Exception {
        System.out.println("valeur_Vehicule");
        int indice = 13;
        int expResult = 170000;
        int result = Voiture.valeur_Vehicule(indice);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of valeur_Vehicule method, of class Voiture.
     */
    @Test
    public void testValeur2_Vehicule() throws Exception {
        System.out.println("valeur_Vehicule");
        int indice =0;
        int expResult = 60000;
        int result = Voiture.valeur_Vehicule(indice);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of valeur_Vehicule method, of class Voiture.
     */
    @Test
    public void testValeur3_Vehicule() throws Exception {
        System.out.println("valeur_Vehicule");
        int indice =1;
        int expResult = 72000;
        int result = Voiture.valeur_Vehicule(indice);
        assertEquals(expResult, result);
    }
    /**
     * Test of valeur_Vehicule method, of class Voiture.
     */
    @Test
    public void testValeur4_Vehicule() throws Exception {
        System.out.println("valeur_Vehicule");
        int indice =52;
        int expResult = 3900000;
        int result = Voiture.valeur_Vehicule(indice);
        assertEquals(expResult, result);
    }
    
}