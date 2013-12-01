/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soumission;

import java.util.Calendar;
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
public class SoumissionTest {
    
    public SoumissionTest() {
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
     * Test of voitureDeLuxe method, of class Soumission.
     */
    @Test
    public void testVoitureDeLuxe() {
        System.out.println("voitureDeLuxe");
        Vehicule vehicule = null;
        boolean expResult = false;
        boolean result = Soumission.voitureDeLuxe(vehicule);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_Voiture method, of class Soumission.
     */
    @Test
    public void testGet_Voiture() {
        System.out.println("get_Voiture");
        int pos = 0;
        Soumission instance = null;
        Voiture expResult = null;
        Voiture result = instance.get_Voiture(pos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_Voitures method, of class Soumission.
     */
    @Test
    public void testGet_Voitures() {
        System.out.println("get_Voitures");
        Soumission instance = null;
        Voiture[] expResult = null;
        Voiture[] result = instance.get_Voitures();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_Nb_Voitures method, of class Soumission.
     */
    @Test
    public void testGet_Nb_Voitures() {
        System.out.println("get_Nb_Voitures");
        Soumission instance = null;
        int expResult = 0;
        int result = instance.get_Nb_Voitures();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_Moto method, of class Soumission.
     */
    @Test
    public void testGet_Moto() {
        System.out.println("get_Moto");
        int pos = 0;
        Soumission instance = null;
        Moto expResult = null;
        Moto result = instance.get_Moto(pos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_Motos method, of class Soumission.
     */
    @Test
    public void testGet_Motos() {
        System.out.println("get_Motos");
        Soumission instance = null;
        Moto[] expResult = null;
        Moto[] result = instance.get_Motos();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_Nb_Motos method, of class Soumission.
     */
    @Test
    public void testGet_Nb_Motos() {
        System.out.println("get_Nb_Motos");
        Soumission instance = null;
        int expResult = 0;
        int result = instance.get_Nb_Motos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_Conducteur method, of class Soumission.
     */
    @Test
    public void testGet_Conducteur() {
        System.out.println("get_Conducteur");
        Soumission instance = null;
        Conducteur expResult = null;
        Conducteur result = instance.get_Conducteur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_Duree_contrat method, of class Soumission.
     */
    @Test
    public void testGet_Duree_contrat() {
        System.out.println("get_Duree_contrat");
        Soumission instance = null;
        int expResult = 0;
        int result = instance.get_Duree_contrat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_Assurable method, of class Soumission.
     */
    @Test
    public void testGet_Assurable() {
        System.out.println("get_Assurable");
        Soumission instance = null;
        boolean expResult = false;
        boolean result = instance.get_Assurable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_Date_debut method, of class Soumission.
     */
    @Test
    public void testGet_Date_debut() {
        System.out.println("get_Date_debut");
        Soumission instance = null;
        Calendar expResult = null;
        Calendar result = instance.get_Date_debut();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
