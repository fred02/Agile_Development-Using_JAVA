/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soumission;

import java.io.FileNotFoundException;
import java.io.IOException;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;
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
public class JsonWriterTest extends JsonWriter{
    
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
    public void testEcriture() throws FileNotFoundException, IOException{
        System.out.println("ecriture");
        boolean assurable = true;
        double total = 0.0;
        double mensualite = 0.0;
        String fichierSortie = "src/test/java/soumission/testSor.json";
        JsonWriter.ecriture(assurable, total, mensualite, fichierSortie);
        String jsonTxt=JsonParsing.load_File_Into_String(fichierSortie, "UTF-8");
        JSONObject root = (JSONObject) JSONSerializer.toJSON(jsonTxt);
        assertEquals(root.getBoolean("assurable"),true);
        assertEquals(root.getDouble("montant_annuel"),0,0.0);
        assertEquals(root.getDouble("mensualite"),0,0.0);
    }
}