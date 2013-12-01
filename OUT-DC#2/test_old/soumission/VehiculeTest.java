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
public class VehiculeTest {
    
    public VehiculeTest() {
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
     * Test of get_Annee method, of class Vehicule.
     */
    @Test
    public void testGet_Annee() {
        System.out.println("get_Annee");
        Vehicule instance = new Vehicule();
        int expResult = 0;
        int result = instance.get_Annee();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_Marque method, of class Vehicule.
     */
    @Test
    public void testGet_Marque() {
        System.out.println("get_Marque");
        Vehicule instance = new Vehicule();
        String expResult = "";
        String result = instance.get_Marque();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_Modele method, of class Vehicule.
     */
    @Test
    public void testGet_Modele() {
        System.out.println("get_Modele");
        Vehicule instance = new Vehicule();
        String expResult = "";
        String result = instance.get_Modele();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_Valeur_des_options method, of class Vehicule.
     */
    @Test
    public void testGet_Valeur_des_options() {
        System.out.println("get_Valeur_des_options");
        Vehicule instance = new Vehicule();
        int expResult = 0;
        int result = instance.get_Valeur_des_options();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_Burinage method, of class Vehicule.
     */
    @Test
    public void testGet_Burinage() {
        System.out.println("get_Burinage");
        Vehicule instance = new Vehicule();
        String expResult = "";
        String result = instance.get_Burinage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isGarage_interieur method, of class Vehicule.
     */
    @Test
    public void testIsGarage_interieur() {
        System.out.println("isGarage_interieur");
        Vehicule instance = new Vehicule();
        boolean expResult = false;
        boolean result = instance.isGarage_interieur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSysteme_alarme method, of class Vehicule.
     */
    @Test
    public void testIsSysteme_alarme() {
        System.out.println("isSysteme_alarme");
        Vehicule instance = new Vehicule();
        boolean expResult = false;
        boolean result = instance.isSysteme_alarme();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_Valeur_Initiale method, of class Vehicule.
     */
    @Test
    public void testGet_Valeur_Initiale() {
        System.out.println("get_Valeur_Initiale");
        Vehicule instance = new Vehicule();
        int expResult = 0;
        int result = instance.get_Valeur_Initiale();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of trouver_Vehicule method, of class Vehicule.
     */
    @Test
    public void testTrouver_Vehicule() throws Exception {
        System.out.println("trouver_Vehicule");
        int annee = 0;
        String marque = "";
        String modele = "";
        int expResult = 0;
        int result = Vehicule.trouver_Vehicule(annee, marque, modele);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valeur_Vehicule method, of class Vehicule.
     */
    @Test
    public void testValeur_Vehicule() throws Exception {
        System.out.println("valeur_Vehicule");
        int indice = 0;
        int expResult = 0;
        int result = Vehicule.valeur_Vehicule(indice);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
