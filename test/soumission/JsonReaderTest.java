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
public class JsonReaderTest {
    
    public JsonReaderTest() {
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
     * Test of LoadFile method, of class JsonReader.
     */
    @Test
    public void testLoadFile() throws Exception {
        System.out.println("LoadFile");
        String fichierEntree = "";
        Soumission<ArrayList> expResult = null;
        Soumission<ArrayList> result = JsonReader.LoadFile(fichierEntree);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
