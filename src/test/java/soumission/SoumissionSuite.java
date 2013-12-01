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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Dacia
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({soumission.ConducteurTest.class, soumission.JsonParsingTest.class, soumission.VehiculeStatsTest.class, soumission.Json.JsonSuite.class, soumission.SoumissionTest.class, soumission.VoitureTest.class, soumission.StatistiqueCalculTest.class, soumission.IndexTest.class, soumission.StatistiqueTest.class, soumission.VehiculeTest.class, soumission.JsonReaderTest.class, soumission.ListeTest.class, soumission.JsonWriterTest.class, soumission.DateParsingTest.class, soumission.MotoTest.class})
public class SoumissionSuite {

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
    
}
