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
     * Test of testDureeContrat method, of class Index.
     */
    @Test
    public void testTestDureeContrat() {
        System.out.println("testDureeContrat");
        int duree = 0;
        boolean expResult = false;
        boolean result = Index.testDureeContrat(duree);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculPrix method, of class Index.
     */
    @Test
    public void testCalculPrix() throws Exception {
        System.out.println("calculPrix");
        int indice=-1;
        Vehicule.valeurVehicule(indice);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculMensualite method, of class Index.
     */
    @Test
    public void testCalculMensualite() {
        System.out.println("calculMensualite");
        double total = 0.0;
        Index.calculMensualite(total);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
