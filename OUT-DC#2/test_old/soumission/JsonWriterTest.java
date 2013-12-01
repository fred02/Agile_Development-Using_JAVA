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
public class JsonWriterTest {
    
    public JsonWriterTest() {
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
     * Test of ecriture method, of class JsonWriter.
     */
    @Test
    public void testEcriture() {
        System.out.println("ecriture");
        boolean assurable = false;
        double total = 0.0;
        double mensualite = 0.0;
        String fichierSortie = "";
        JsonWriter.ecriture(assurable, total, mensualite, fichierSortie);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
