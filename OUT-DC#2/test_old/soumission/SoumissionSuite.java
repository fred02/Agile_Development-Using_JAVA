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
import soumission.Json.JsonSuite;

/**
 *
 * @author Dacia
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({JsonSuite.class, VehiculeStatsTest.class, VehiculeTest.class, VoitureTest.class, StatistiqueTest.class, JsonParsingTest.class, ListeTest.class, SoumissionTest.class, IndexTest.class, JsonWriterTest.class, JsonReaderTest.class, MotoTest.class, ConducteurTest.class})
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
