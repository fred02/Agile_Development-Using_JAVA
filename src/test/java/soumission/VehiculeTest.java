/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soumission;

import net.sf.json.JSONObject;
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
public class VehiculeTest {
    
    public VehiculeTest() {
    }
    JSONObject jVehicule;
    Vehicule vehicule1;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        jVehicule=new JSONObject();
        jVehicule.put("annee",2014);
        jVehicule.put("marque","Porsche");
        jVehicule.put("modele","911 Turbo");
        jVehicule.put("valeur_des_options",8000);
        jVehicule.put("burinage","PROACTIF");
        jVehicule.put("garage_interieur",true);
        jVehicule.put("systeme_alarme",true);
        vehicule1=new Vehicule(jVehicule,170000);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testVehicule()
    {
        System.out.println("Vehicule");
        Vehicule vehicule2=new Vehicule(2014,"Porsche","911 Turbo",8000,"PROACTIF",true,true,170000);
        assertNotNull(vehicule2);
        assertTrue(vehicule1.equals(vehicule2));
        Vehicule vehicule3=new Vehicule();
        assertNotNull(vehicule3);
        assertFalse(vehicule1.equals(vehicule3));
    }
    
    /**
     * Test of get_Annee method, of class Vehicule.
     */
    @Test
    public void testGet_Annee() {
        System.out.println("get_Annee");
        int expResult = 2014;
        int result = vehicule1.get_Annee();
        assertEquals(expResult, result);
    }

    /**
     * Test of get_Marque method, of class Vehicule.
     */
    @Test
    public void testGet_Marque() {
        System.out.println("get_Marque");
        String expResult = "Porsche";
        String result = vehicule1.get_Marque();
        assertEquals(expResult, result);
    }

    /**
     * Test of get_Modele method, of class Vehicule.
     */
    @Test
    public void testGet_Modele() {
        System.out.println("get_Modele");
        String expResult = "911 Turbo";
        String result = vehicule1.get_Modele();
        assertEquals(expResult, result);
    }

    /**
     * Test of get_Valeur_des_options method, of class Vehicule.
     */
    @Test
    public void testGet_Valeur_des_options() {
        System.out.println("get_Valeur_des_options");
        int expResult = 8000;
        int result = vehicule1.get_Valeur_des_options();
        assertEquals(expResult, result);
    }

    /**
     * Test of get_Burinage method, of class Vehicule.
     */
    @Test
    public void testGet_Burinage() {
        System.out.println("get_Burinage");
        String expResult = "PROACTIF";
        String result = vehicule1.get_Burinage();
        assertEquals(expResult, result);
    }

    /**
     * Test of isGarage_interieur method, of class Vehicule.
     */
    @Test
    public void testIsGarage_interieur() {
        System.out.println("isGarage_interieur");
        boolean expResult = true;
        boolean result = vehicule1.isGarage_interieur();
        assertEquals(expResult, result);
    }

    /**
     * Test of isSysteme_alarme method, of class Vehicule.
     */
    @Test
    public void testIsSysteme_alarme() {
        System.out.println("isSysteme_alarme");
        boolean expResult = true;
        boolean result = vehicule1.isSysteme_alarme();
        assertEquals(expResult, result);
    }

    /**
     * Test of get_Valeur_Initiale method, of class Vehicule.
     */
    @Test
    public void testGet_Valeur_Initiale() {
        System.out.println("get_Valeur_Initiale");
        int expResult = 170000;
        int result = vehicule1.get_Valeur_Initiale();
        assertEquals(expResult, result);
    }

    /**
     * Test of trouver_Vehicule method, of class Vehicule.
     */
    @Test
    public void testTrouver_Vehicule() throws Exception {
        System.out.println("trouver_Vehicule");
        int expResult = -1;
        int result = Vehicule.trouver_Vehicule(0,"","");
        assertEquals(expResult, result);
    }

    /**
     * Test of valeur_Vehicule method, of class Vehicule.
     */
    @Test
    public void testValeur_Vehicule() throws Exception {
        System.out.println("valeur_Vehicule");
        int expResult = 0;
        int result = Vehicule.valeur_Vehicule(0);
        assertEquals(expResult, result);
    }
}