/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
 * @author Dacia
 */
public class SoumissionTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
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
    
   /* public SoumissionTest() {
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

    
    @Test
    public void testGetAnnee() {
        System.out.println("getAnnee");
        Soumission instance = null;
        int expResult = 0;
        int result = instance.getAnnee();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testGetMarque() {
        System.out.println("getMarque");
        Soumission instance = new Soumission();
        String expResult = "";
        String result = instance.getMarque();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testGetModele() {
        System.out.println("getModele");
        Soumission instance = new Soumission();
        String expResult = "";
        String result = instance.getModele();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   
    @Test
    public void testGetValeur_des_options() {
        System.out.println("getValeur_des_options");
        Soumission instance = new Soumission();
        int expResult = 0;
        int result = instance.getValeur_des_options();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testGetBurinage() {
        System.out.println("getBurinage");
        Soumission instance = new Soumission();
        String expResult = "";
        String result = instance.getBurinage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   
    @Test
    public void testIsGarage_interieur() {
        System.out.println("isGarage_interieur");
        Soumission instance = new Soumission();
        boolean expResult = false;
        boolean result = instance.isGarage_interieur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testIsSysteme_alarme() {
        System.out.println("isSysteme_alarme");
        Soumission instance = new Soumission();
        boolean expResult = false;
        boolean result = instance.isSysteme_alarme();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testGetDate_de_naissance() {
        System.out.println("getDate_de_naissance");
        Soumission instance = new Soumission();
        String expResult = "";
        String result = instance.getDate_de_naissance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testGetAgeGC() {
        System.out.println("GetAgeGC");
        Soumission instance = new Soumission();
        GregorianCalendar expResult = null;
        GregorianCalendar result = instance.GetAgeGC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testGetAge() {
        System.out.println("GetAge");
        Soumission instance = new Soumission();
        int expResult = 0;
        int result = instance.GetAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testGetProvince() {
        System.out.println("getProvince");
        Soumission instance = new Soumission();
        String expResult = "";
        String result = instance.getProvince();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testGetVille() {
        System.out.println("getVille");
        Soumission instance = new Soumission();
        String expResult = "";
        String result = instance.getVille();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testGetSexe() {
        System.out.println("getSexe");
        Soumission instance = new Soumission();
        char expResult = ' ';
        char result = instance.getSexe();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testGetDate_fin_cours_de_conduite() {
        System.out.println("getDate_fin_cours_de_conduite");
        Soumission instance = new Soumission();
        String expResult = "";
        String result = instance.getDate_fin_cours_de_conduite();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testGetDate_fin_cours_GC() {
        System.out.println("GetDate_fin_cours_GC");
        Soumission instance = new Soumission();
        GregorianCalendar expResult = null;
        GregorianCalendar result = instance.GetDate_fin_cours_GC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testGetExperience() {
        System.out.println("GetExperience");
        Soumission instance = new Soumission();
        int expResult = 0;
        int result = instance.GetExperience();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testIsCours_de_conduite_reconnus_par_CAA() {
        System.out.println("isCours_de_conduite_reconnus_par_CAA");
        Soumission instance = new Soumission();
        boolean expResult = false;
        boolean result = instance.isCours_de_conduite_reconnus_par_CAA();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testIsPremier_contrat() {
        System.out.println("isPremier_contrat");
        Soumission instance = new Soumission();
        boolean expResult = false;
        boolean result = instance.isPremier_contrat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testGetDuree_contrat() {
        System.out.println("getDuree_contrat");
        Soumission instance = new Soumission();
        int expResult = 0;
        int result = instance.get_Duree_contrat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testDisplay() {
        System.out.println("display");
        Soumission instance = new Soumission();
        instance.display();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}
