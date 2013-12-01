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
public class VehiculeStatsTest {
    
    public VehiculeStatsTest() {
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
     * Test of incrementerLeVehicule method, of class VehiculeStats.
     */
    @Test
    public void testIncrementerLeVehicule() {
        System.out.println("incrementerLeVehicule");
        VehiculeStats instance = null;
        instance.incrementerLeVehicule();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of marqueExistante method, of class VehiculeStats.
     */
    @Test
    public void testMarqueExistante() {
        System.out.println("marqueExistante");
        VehiculeStats instance = null;
        String expResult = "";
        String result = instance.marqueExistante();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nombreParMarque method, of class VehiculeStats.
     */
    @Test
    public void testNombreParMarque() {
        System.out.println("nombreParMarque");
        VehiculeStats instance = null;
        int expResult = 0;
        int result = instance.nombreParMarque();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
