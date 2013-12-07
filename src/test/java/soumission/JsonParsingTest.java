/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soumission;

import java.io.FileNotFoundException;
import java.io.IOException;
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
public class JsonParsingTest extends JsonParsing{
    
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
    public void testLoad_File_Into_String() throws FileNotFoundException, IOException {
        System.out.println("load_File_Into_String");
        String filePath = "src/test/java/soumission/testEnt1.json";
        String fileEncoding = "UTF-8";
        String result = JsonParsing.load_File_Into_String(filePath, fileEncoding);
        assertNotNull(result);
    }
}