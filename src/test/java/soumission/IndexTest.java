/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soumission;

import java.util.ArrayList;
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
public class IndexTest {
    
    public IndexTest() {
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
     * Test of main method, of class Index.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        Index.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Options method, of class Index.
     */
    @Test
    public void testOptions() throws Exception {
        System.out.println("Options");
        String option = "";
        String fichierEcriture = "";
        Index.Options(option, fichierEcriture);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tester_Duree_Contrat method, of class Index.
     */
    @Test
    public void testTester_Duree_Contrat() {
        System.out.println("tester_Duree_Contrat");
        int duree = 0;
        boolean expResult = false;
        boolean result = Index.tester_Duree_Contrat(duree);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculer_Pourcentage_DeBase method, of class Index.
     */
    @Test
    public void testCalculer_Pourcentage_DeBase() {
        System.out.println("calculer_Pourcentage_DeBase");
        int age = 0;
        char sexe = ' ';
        double expResult = 0.0;
        double result = Index.calculer_Pourcentage_DeBase(age, sexe);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculer_Prix_Soumission method, of class Index.
     */
    @Test
    public void testCalculer_Prix_Soumission() throws Exception {
        System.out.println("calculer_Prix_Soumission");
        Soumission<ArrayList> soumission1 = null;
        double expResult = 0.0;
        double result = Index.calculer_Prix_Soumission(soumission1);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculer_Prix_Vehicule method, of class Index.
     */
    @Test
    public void testCalculer_Prix_Vehicule() throws Exception {
        System.out.println("calculer_Prix_Vehicule");
        Conducteur conducteur = null;
        Vehicule vehicule = null;
        int duree_Contrat = 0;
        double expResult = 0.0;
        double result = Index.calculer_Prix_Vehicule(conducteur, vehicule, duree_Contrat);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculer_Mensualite method, of class Index.
     */
    @Test
    public void testCalculer_Mensualite() {
        System.out.println("calculer_Mensualite");
        double total = 0.0;
        double expResult = 0.0;
        double result = Index.calculer_Mensualite(total);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
