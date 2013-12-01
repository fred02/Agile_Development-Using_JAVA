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
public class VoitureTest {
    
    public VoitureTest() {
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
     * Test of trouver_Vehicule method, of class Voiture.
     */
    @Test
    public void testTrouver_Vehicule() throws Exception {
        System.out.println("trouver_Vehicule");
        int annee = 0;
        String marque = "";
        String modele = "";
        int expResult = 0;
        int result = Voiture.trouver_Vehicule(annee, marque, modele);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valeur_Vehicule method, of class Voiture.
     */
    @Test
    public void testValeur_Vehicule() throws Exception {
        System.out.println("valeur_Vehicule");
        int indice = 0;
        int expResult = 0;
        int result = Voiture.valeur_Vehicule(indice);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
