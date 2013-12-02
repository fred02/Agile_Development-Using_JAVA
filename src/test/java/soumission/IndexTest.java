/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soumission;

import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Cours: INF2015 Enseignant: Jacques Berger
 *
 * Projet pour DDC #1
 *
 * Equipe 8 Etudiants:
 *
 * Gabriel Jourdenais-Hamel JOUG08108901 
 * Fahd Kacem               KACF21038103 
 * Jonathan Drolet          DROJ13078506
 * Vincent Lavoie           LAVV07068909
 */

public class IndexTest {
    
    public IndexTest() {
    }
        private Conducteur  CT1;
        private Conducteur  CT2;
        private Vehicule    VT1;
        private Vehicule    VT2;
    
    @Before
    public void setUp() {
        CT1 = new Conducteur("1985-10-15", "Québec", "Longueuil", 'M',
            "1995-03-01", true,true, true);
        CT2 = new Conducteur("1975-10-15","Québec", "vaudreuil", 'M',
            "2008-03-01", true,true, true);
        VT1 = new Vehicule(2014, "Porsche", "Boxter",8000 ,
            "PROACTIF", true, true, 60000);
        VT1 = new Vehicule(2013, "Porsche", "918 Spyder",2000 ,
            "Sherlock", true, true, 845000);
    }
    
    @After
    public void tearDown() {
    }


    @Test
    public void testMain() throws Exception {

    }


    @Test
    public void testOptions() throws Exception {

    }


    @Test
    public void testTester_Duree_Contrat() {
        assertTrue(Index.tester_Duree_Contrat(1));
        assertTrue(Index.tester_Duree_Contrat(2));
        assertTrue(Index.tester_Duree_Contrat(3));
        assertFalse(Index.tester_Duree_Contrat(0));
        assertFalse(Index.tester_Duree_Contrat(-1));
        assertFalse(Index.tester_Duree_Contrat(4));
    }

    @Test
    public void testCalculer_Pourcentage_DeBase() {
        assertEquals(0.11,Index.calculer_Pourcentage_DeBase(29, 'f'),00);
        assertEquals(0.09,Index.calculer_Pourcentage_DeBase(48, 'f'),00);
        assertEquals(0.155,Index.calculer_Pourcentage_DeBase(66, 'F'),00);
        assertEquals(0.15,Index.calculer_Pourcentage_DeBase(25, 'm'),00);
        assertEquals(0.12,Index.calculer_Pourcentage_DeBase(60, 'm'),00);
        assertEquals(0.135,Index.calculer_Pourcentage_DeBase(61, 'M'),00);
        
        
    }

    @Test
    public void testCalculer_Prix_Soumission() throws Exception {

    }

    @Test
    public void testCalculer_Prix_Vehicule() throws Exception {
            assertEquals(129900,Index.calculer_Prix_Vehicule(CT1, VT1, 1),005);
            assertEquals(89540,Index.calculer_Prix_Vehicule(CT2, VT1, 3),005);
    }

    @Test
    public void testCalculer_Mensualite() {
           assertEquals(1015,Index.calculer_Mensualite(12000),005);
           assertEquals(55.34,Index.calculer_Mensualite(654.21),005);
           assertEquals(844.83,Index.calculer_Mensualite(9988.11),005);
    }
    
}
