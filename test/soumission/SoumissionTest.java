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
     * Test of getAnnee method, of class Soumission.
     */
    @Test
    public void testGetAnnee() {
        System.out.println("getAnnee");
        Soumission instance = new Soumission();
        int expResult = 0;
        int result = instance.getAnnee();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAnnee method, of class Soumission.
     */
    @Test
    public void testSetAnnee() {
        System.out.println("setAnnee");
        int annee = 0;
        Soumission instance = new Soumission();
        instance.setAnnee(annee);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMarque method, of class Soumission.
     */
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

    /**
     * Test of setMarque method, of class Soumission.
     */
    @Test
    public void testSetMarque() {
        System.out.println("setMarque");
        String marque = "";
        Soumission instance = new Soumission();
        instance.setMarque(marque);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModele method, of class Soumission.
     */
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

    /**
     * Test of setModele method, of class Soumission.
     */
    @Test
    public void testSetModele() {
        System.out.println("setModele");
        String modele = "";
        Soumission instance = new Soumission();
        instance.setModele(modele);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValeur_des_options method, of class Soumission.
     */
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

    /**
     * Test of setValeur_des_options method, of class Soumission.
     */
    @Test
    public void testSetValeur_des_options() {
        System.out.println("setValeur_des_options");
        int valeur_des_options = 0;
        Soumission instance = new Soumission();
        instance.setValeur_des_options(valeur_des_options);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBurinage method, of class Soumission.
     */
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

    /**
     * Test of setBurinage method, of class Soumission.
     */
    @Test
    public void testSetBurinage() {
        System.out.println("setBurinage");
        String burinage = "";
        Soumission instance = new Soumission();
        instance.setBurinage(burinage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isGarage_interieur method, of class Soumission.
     */
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

    /**
     * Test of setGarage_interieur method, of class Soumission.
     */
    @Test
    public void testSetGarage_interieur() {
        System.out.println("setGarage_interieur");
        boolean garage_interieur = false;
        Soumission instance = new Soumission();
        instance.setGarage_interieur(garage_interieur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSysteme_alarme method, of class Soumission.
     */
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

    /**
     * Test of setSysteme_alarme method, of class Soumission.
     */
    @Test
    public void testSetSysteme_alarme() {
        System.out.println("setSysteme_alarme");
        boolean systeme_alarme = false;
        Soumission instance = new Soumission();
        instance.setSysteme_alarme(systeme_alarme);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate_de_naissance method, of class Soumission.
     */
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

    /**
     * Test of setDate_de_naissance method, of class Soumission.
     */
    @Test
    public void testSetDate_de_naissance() {
        System.out.println("setDate_de_naissance");
        String date_de_naissance = "";
        Soumission instance = new Soumission();
        instance.setDate_de_naissance(date_de_naissance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetAgeGC method, of class Soumission.
     */
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

    /**
     * Test of GetAge method, of class Soumission.
     */
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

    /**
     * Test of getProvince method, of class Soumission.
     */
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

    /**
     * Test of setProvince method, of class Soumission.
     */
    @Test
    public void testSetProvince() {
        System.out.println("setProvince");
        String province = "";
        Soumission instance = new Soumission();
        instance.setProvince(province);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVille method, of class Soumission.
     */
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

    /**
     * Test of setVille method, of class Soumission.
     */
    @Test
    public void testSetVille() {
        System.out.println("setVille");
        String ville = "";
        Soumission instance = new Soumission();
        instance.setVille(ville);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSexe method, of class Soumission.
     */
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

    /**
     * Test of setSexe method, of class Soumission.
     */
    @Test
    public void testSetSexe() {
        System.out.println("setSexe");
        char sexe = ' ';
        Soumission instance = new Soumission();
        instance.setSexe(sexe);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate_fin_cours_de_conduite method, of class Soumission.
     */
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

    /**
     * Test of setDate_fin_cours_de_conduite method, of class Soumission.
     */
    @Test
    public void testSetDate_fin_cours_de_conduite() {
        System.out.println("setDate_fin_cours_de_conduite");
        String date_fin_cours_de_conduite = "";
        Soumission instance = new Soumission();
        instance.setDate_fin_cours_de_conduite(date_fin_cours_de_conduite);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetDate_fin_cours_GC method, of class Soumission.
     */
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

    /**
     * Test of GetExperience method, of class Soumission.
     */
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

    /**
     * Test of isCours_de_conduite_reconnus_par_CAA method, of class Soumission.
     */
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

    /**
     * Test of setCours_de_conduite_reconnus_par_CAA method, of class Soumission.
     */
    @Test
    public void testSetCours_de_conduite_reconnus_par_CAA() {
        System.out.println("setCours_de_conduite_reconnus_par_CAA");
        boolean cours_de_conduite_reconnus_par_CAA = false;
        Soumission instance = new Soumission();
        instance.setCours_de_conduite_reconnus_par_CAA(cours_de_conduite_reconnus_par_CAA);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPremier_contrat method, of class Soumission.
     */
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

    /**
     * Test of setPremier_contrat method, of class Soumission.
     */
    @Test
    public void testSetPremier_contrat() {
        System.out.println("setPremier_contrat");
        boolean premier_contrat = false;
        Soumission instance = new Soumission();
        instance.setPremier_contrat(premier_contrat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDuree_contrat method, of class Soumission.
     */
    @Test
    public void testGetDuree_contrat() {
        System.out.println("getDuree_contrat");
        Soumission instance = new Soumission();
        int expResult = 0;
        int result = instance.getDuree_contrat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDuree_contrat method, of class Soumission.
     */
    @Test
    public void testSetDuree_contrat() {
        System.out.println("setDuree_contrat");
        int duree_contrat = 0;
        Soumission instance = new Soumission();
        instance.setDuree_contrat(duree_contrat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAssurable method, of class Soumission.
     */
    @Test
    public void testIsAssurable() {
        System.out.println("isAssurable");
        Soumission instance = new Soumission();
        boolean expResult = false;
        boolean result = instance.isAssurable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAssurable method, of class Soumission.
     */
    @Test
    public void testSetAssurable() {
        System.out.println("setAssurable");
        boolean assurable = false;
        Soumission instance = new Soumission();
        instance.setAssurable(assurable);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMontant_annuel method, of class Soumission.
     */
    @Test
    public void testGetMontant_annuel() {
        System.out.println("getMontant_annuel");
        Soumission instance = new Soumission();
        int expResult = 0;
        int result = instance.getMontant_annuel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMontant_annuel method, of class Soumission.
     */
    @Test
    public void testSetMontant_annuel() {
        System.out.println("setMontant_annuel");
        int montant_annuel = 0;
        Soumission instance = new Soumission();
        instance.setMontant_annuel(montant_annuel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMensualite method, of class Soumission.
     */
    @Test
    public void testGetMensualite() {
        System.out.println("getMensualite");
        Soumission instance = new Soumission();
        int expResult = 0;
        int result = instance.getMensualite();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMensualite method, of class Soumission.
     */
    @Test
    public void testSetMensualite() {
        System.out.println("setMensualite");
        int mensualite = 0;
        Soumission instance = new Soumission();
        instance.setMensualite(mensualite);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of display method, of class Soumission.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        Soumission instance = new Soumission();
        instance.display();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
