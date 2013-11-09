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
public class JsonParsingTest {
    
    public JsonParsingTest() {
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
     * Test of load_File_Into_String method, of class JsonParsing.
     */
    @Test
    public void testLoadFileIntoString() throws Exception {
        System.out.println("loadFileIntoString");
        String filePath = "";
        String fileEncoding = "";
        String expResult = "";
        String result = JsonParsing.load_File_Into_String(filePath, fileEncoding);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of load_File_Into_String method, of class JsonParsing.
     */
    @Test
    public void testLoad_File_Into_String() throws Exception {
        System.out.println("load_File_Into_String");
        String filePath = "";
        String fileEncoding = "";
        String expResult = "";
        String result = JsonParsing.load_File_Into_String(filePath, fileEncoding);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
