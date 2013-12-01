/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soumission;

import net.sf.json.JSONArray;
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
public class ListeTest {
    
    public ListeTest() {
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
     * Test of Print method, of class Liste.
     */
    @Test
    public void testPrint() throws Exception {
        System.out.println("Print");
        String fichierEcriture = "";
        Liste.Print(fichierEcriture);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of trier_tab_json method, of class Liste.
     */
    @Test
    public void testTrier_tab_json() {
        System.out.println("trier_tab_json");
        JSONArray array = null;
        JSONArray expResult = null;
        JSONArray result = Liste.trier_tab_json(array);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
