/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soumission;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dacia
 */
public class MotoTest {
    
    public MotoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
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
        Moto instance = null;
        double expResult = 0.0;
        double result = instance.getCc();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of trouver_Vehicule method, of class Moto.
     */
    @Test
    public void testTrouver_Vehicule() throws Exception {
        System.out.println("trouver_Vehicule");
        int annee = 0;
        String marque = "";
        String modele = "";
        int expResult = 0;
        int result = Moto.trouver_Vehicule(annee, marque, modele);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valeur_Vehicule method, of class Moto.
     */
    @Test
    public void testValeur_Vehicule() throws Exception {
        System.out.println("valeur_Vehicule");
        int indice = 0;
        int expResult = 0;
        int result = Moto.valeur_Vehicule(indice);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cc_Moto method, of class Moto.
     */
    @Test
    public void testCc_Moto() throws Exception {
        System.out.println("cc_Moto");
        int indice = 0;
        double expResult = 0.0;
        double result = Moto.cc_Moto(indice);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
