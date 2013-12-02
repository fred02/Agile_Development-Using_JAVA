/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soumission;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import net.sf.json.JSONObject;
import net.sf.json.JSONArray;
import net.sf.json.JSONSerializer;
/**
 *
 * @author Dacia
 */
public class ConducteurTest {
    
    public ConducteurTest() {
    }
    private Conducteur CT1;
    private Conducteur CT2;
    private Conducteur CT3;
    private Conducteur CT4;
    JSONObject CTJ;

    
    @Before
    public void setUp() {
        CT1 = new Conducteur("1985-10-15", "Québec", "Longueil", 'M',
            "2008-03-01", true,true, true);
        CT2 = new Conducteur("1925-10-15","Ontario", "Longueil", 'M',
            "2008-03-01", true,false, true);
        CT3 = new Conducteur("1999-12-01", "Québec", "Longueil", 'F',
            "2008-12-25", true,true, true);
        
        CTJ = new JSONObject();
        CTJ.put("date_de_naissance","1980-01-15");
        CTJ.put("province","Québec");     
        CTJ.put("ville", "Montréal");
        CTJ.put("sexe","M");
        CTJ.put("date_fin_cours_de_conduite", "2000-12-01");
        CTJ.put("cours_de_conduite_reconnus_par_CAA", true);
        CTJ.put("premier_contrat", false);
	CTJ.put("membre_oiq", true);
    }
    
    @After
    public void tearDown() {
        
    }
    @Test
    public void testConducteur(){
        Conducteur CT5 = new Conducteur();
        assertNotNull(CT5);
        CT4 = new Conducteur(CTJ);
        assertNotNull(CT4);
    }

    @Test
    public void testGetDate_de_naissance() {
        assertEquals("1985-10-15",CT1.getDate_de_naissance());
    }


    @Test
    public void testIsMembre_oiq() {
        assertTrue(CT1.isMembre_oiq());
    }

    @Test
    public void testGet_Age() {
        assertEquals(28,CT1.get_Age());
        assertEquals(88,CT2.get_Age());
        assertEquals(13,CT3.get_Age());
    }

    @Test
    public void testGet_Province() {
        assertEquals("Québec", CT1.get_Province());
    }

    @Test
    public void testGet_Ville() {
        assertEquals("Longueil", CT1.get_Ville());
    }

    @Test
    public void testGet_Sexe() {
        assertEquals('M',CT1.get_Sexe());
    }

    @Test
    public void testGetDate_fin_cours_de_conduite() {
        assertEquals("2008-03-01",CT1.getDate_fin_cours_de_conduite());
    }

    @Test
    public void testGet_Experience() {
        assertEquals(5,CT1.get_Experience());
    }

    @Test
    public void testIsCours_de_conduite_reconnus_par_CAA() {
        assertTrue(CT1.isCours_de_conduite_reconnus_par_CAA());
    }

    public void testIsPremier_contrat() {
        assertTrue(CT1.isPremier_contrat());
        assertFalse(CT2.isPremier_contrat());
        CT4 = new Conducteur();
        assertTrue(CT4.isPremier_contrat());
    }

    @Test
    public void testAssurable() {
        assertTrue(CT1.assurable(CT1));
        assertFalse(CT2.assurable(CT2));
        assertFalse(CT3.assurable(CT3));
    }
    
}
