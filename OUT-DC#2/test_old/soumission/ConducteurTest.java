/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soumission;

import java.util.ArrayList;
import java.util.GregorianCalendar;
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
public class ConducteurTest {
    
    public ConducteurTest() {
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
     * Test of ageValide method, of class Conducteur.
     */
    @Test
    public void testAssurable() {
        System.out.println("ageValide");
        Conducteur conducteur = null;
        boolean expResult = false;
        boolean result = Conducteur.assurable(conducteur);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate_de_naissance method, of class Conducteur.
     */
    @Test
    public void testGetDate_de_naissance() {
        System.out.println("getDate_de_naissance");
        Conducteur instance = new Conducteur();
        String expResult = "";
        String result = instance.getDate_de_naissance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isMembre_oiq method, of class Conducteur.
     */
    @Test
    public void testIsMembre_oiq() {
        System.out.println("isMembre_oiq");
        Conducteur instance = new Conducteur();
        boolean expResult = false;
        boolean result = instance.isMembre_oiq();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_age_GC method, of class Conducteur.
     */
    @Test
    public void testGet_age_GC() {
        System.out.println("get_age_GC");
        Conducteur instance = new Conducteur();
        GregorianCalendar expResult = null;
        GregorianCalendar result = instance.get_age_GC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_Age method, of class Conducteur.
     */
    @Test
    public void testGet_Age() {
        System.out.println("get_Age");
        Conducteur instance = new Conducteur();
        int expResult = 0;
        int result = instance.get_Age();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_Province method, of class Conducteur.
     */
    @Test
    public void testGet_Province() {
        System.out.println("get_Province");
        Conducteur instance = new Conducteur();
        String expResult = "";
        String result = instance.get_Province();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_Ville method, of class Conducteur.
     */
    @Test
    public void testGet_Ville() {
        System.out.println("get_Ville");
        Conducteur instance = new Conducteur();
        String expResult = "";
        String result = instance.get_Ville();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_Sexe method, of class Conducteur.
     */
    @Test
    public void testGet_Sexe() {
        System.out.println("get_Sexe");
        Conducteur instance = new Conducteur();
        char expResult = ' ';
        char result = instance.get_Sexe();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate_fin_cours_de_conduite method, of class Conducteur.
     */
    @Test
    public void testGetDate_fin_cours_de_conduite() {
        System.out.println("getDate_fin_cours_de_conduite");
        Conducteur instance = new Conducteur();
        String expResult = "";
        String result = instance.getDate_fin_cours_de_conduite();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate_fin_cours_GC method, of class Conducteur.
     */
    @Test
    public void testGetDate_fin_cours_GC() {
        System.out.println("getDate_fin_cours_GC");
        Conducteur instance = new Conducteur();
        GregorianCalendar expResult = null;
        GregorianCalendar result = instance.getDate_fin_cours_GC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_Experience method, of class Conducteur.
     */
    @Test
    public void testGet_Experience() {
        System.out.println("get_Experience");
        Conducteur instance = new Conducteur();
        int expResult = 0;
        int result = instance.get_Experience();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCours_de_conduite_reconnus_par_CAA method, of class Conducteur.
     */
    @Test
    public void testIsCours_de_conduite_reconnus_par_CAA() {
        System.out.println("isCours_de_conduite_reconnus_par_CAA");
        Conducteur instance = new Conducteur();
        boolean expResult = false;
        boolean result = instance.isCours_de_conduite_reconnus_par_CAA();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPremier_contrat method, of class Conducteur.
     */
    @Test
    public void testIsPremier_contrat() {
        System.out.println("isPremier_contrat");
        Conducteur instance = new Conducteur();
        boolean expResult = false;
        boolean result = instance.isPremier_contrat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
