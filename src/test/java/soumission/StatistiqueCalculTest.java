/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soumission;

import java.util.ArrayList;
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
public class StatistiqueCalculTest {
    
    public StatistiqueCalculTest() {
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
     * Test of CalculerStatsAssurable method, of class StatistiqueCalcul.
     */
    @Test
    public void testCalculerStatsAssurable() {
        System.out.println("CalculerStatsAssurable");
        Statistique statistiqueCourante1 = null;
        Soumission<ArrayList> soumission1 = null;
        StatistiqueCalcul.CalculerStatsAssurable(statistiqueCourante1, soumission1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CalculerStatsNonAssurable method, of class StatistiqueCalcul.
     */
    @Test
    public void testCalculerStatsNonAssurable() {
        System.out.println("CalculerStatsNonAssurable");
        Statistique statistiqueCourante2 = null;
        Soumission<ArrayList> soumission2 = null;
        StatistiqueCalcul.CalculerStatsNonAssurable(statistiqueCourante2, soumission2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
