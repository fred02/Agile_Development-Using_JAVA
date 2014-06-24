/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soumission;

import soumissionAss.Moto;
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
public class MotoTest {
    
    public MotoTest() {
    }
    JSONObject jMoto;
    Moto moto1;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        jMoto=new JSONObject();
        jMoto.put("annee",2013);
        jMoto.put("marque","Ducati");
        jMoto.put("modele","Superbike 1199 Panigale R");
        jMoto.put("valeur_des_options",1000);
        jMoto.put("burinage","PROACTIF");
        jMoto.put("garage_interieur",false);
        jMoto.put("systeme_alarme",false);
        moto1=new Moto(jMoto,32000,1198);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCc method, of class Moto.
     */
    @Test
    public void testGetCc() {
        System.out.println("getCc");
        double expResult = 1198;
        double result = moto1.getCc();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of trouver_Vehicule method, of class Moto.
     */
    @Test
    public void testTrouver_Vehicule() throws Exception {
        System.out.println("trouver_Vehicule");
        int annee = 2013;
        String marque = "Ducati";
        String modele = "Superbike 1199 Panigale R";
        int expResult = 4;
        int result = Moto.trouver_Vehicule(annee, marque, modele);
        assertEquals(expResult, result);
    }

    /**
     * Test of valeur_Vehicule method, of class Moto.
     */
    @Test
    public void testValeur_Vehicule() throws Exception {
        System.out.println("valeur_Vehicule");
        int indice = 4;
        int expResult = 32000;
        int result = Moto.valeur_Vehicule(indice);
        assertEquals(expResult, result);
    }

    /**
     * Test of cc_Moto method, of class Moto.
     */
    @Test
    public void testCc_Moto() throws Exception {
        System.out.println("cc_Moto");
        int indice = 4;
        double expResult = 1198;
        double result = Moto.cc_Moto(indice);
        assertEquals(expResult, result, 0.0);
    }
}