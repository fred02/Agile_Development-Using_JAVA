/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soumission;

import java.util.GregorianCalendar;
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
public class DateParsingTest extends DateParsing{
    
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
     * Test of stringToCalendar method, of class DateParsing.
     */
    @Test
    public void testStringToCalendar() {
        System.out.println("stringToCalendar");
        String chaine = "1980-01-15";
        GregorianCalendar expResult= new GregorianCalendar(1980,1,15);
        GregorianCalendar result = DateParsing.stringToCalendar(chaine);
        assertEquals(expResult, result);
    }
}