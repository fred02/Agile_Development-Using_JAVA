/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soumission;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static soumission.Index.main;

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

public class IndexTest extends Index{
    
    public IndexTest() {
    }
        private JSONObject jSoumission;
        private JSONObject jVoiture;
        private JSONArray jVoitures;
        private JSONObject jMoto;
        private JSONArray jMotos;
        private JSONObject jConducteur;
    
        private Soumission soumission1;
        private Conducteur  CT1;
        private Conducteur  CT2;
        private Vehicule    VT1;
        private Vehicule    VT2;
    
    @Before
    public void setUp() throws NullPointerException, FileNotFoundException, IOException{
        CT1 = new Conducteur("1985-10-15", "Québec", "Longueuil", 'M',
            "1995-03-01", true,true, true);
        CT2 = new Conducteur("1975-10-15","Québec", "vaudreuil", 'M',
            "2008-03-01", true,true, true);
        VT1 = new Vehicule(2014, "Porsche", "Boxter",8000 ,
            "PROACTIF", true, true, 60000);
        VT1 = new Vehicule(2013, "Porsche", "918 Spyder",2000 ,
            "Sherlock", true, true, 845000);
        
        jVoiture=new JSONObject();
        jVoiture.put("annee",2013);
        jVoiture.put("marque","Porsche");
        jVoiture.put("modele","918 Spyder");
        jVoiture.put("valeur_des_options",8000);
        jVoiture.put("burinage","PROACTIF");
        jVoiture.put("garage_interieur",true);
        jVoiture.put("systeme_alarme",true);
        
        jVoitures=new JSONArray();
        jVoitures.add(jVoiture);
        
        jMoto=new JSONObject();
        jMoto.put("annee",2013);
        jMoto.put("marque","Ducati");
        jMoto.put("modele","Superbike 1199 Panigale R");
        jMoto.put("valeur_des_options",1000);
        jMoto.put("burinage","PROACTIF");
        jMoto.put("garage_interieur",false);
        jMoto.put("systeme_alarme",false);
        
        jMotos=new JSONArray();
        jMotos.add(jMoto);
        
        jConducteur=new JSONObject();
        jConducteur.put("date_de_naissance","1980-01-15");
        jConducteur.put("province","Québec");     
        jConducteur.put("ville", "Montréal");
        jConducteur.put("sexe","M");
        jConducteur.put("date_fin_cours_de_conduite", "2000-12-01");
        jConducteur.put("cours_de_conduite_reconnus_par_CAA", true);
        jConducteur.put("premier_contrat", false);
	jConducteur.put("membre_oiq", true);
        
        jSoumission=new JSONObject();
        jSoumission.put("voitures",jVoitures);
        jSoumission.put("motos",jMotos);
        jSoumission.put("conducteur",jConducteur);
        jSoumission.put("duree_contrat",2);
        jSoumission.put("date_debut","2014-01-04");
        
        soumission1=new Soumission(jSoumission);
    }
    
    @After
    public void tearDown() {
    }


    @Test
    public void testMain() throws Exception {
        JSONObject root;
        String jsonTxt;
        
        String args1[]={"src/test/java/soumission/testEnt1.json","src/test/java/soumission/testSor.json"};
        main(args1);
        jsonTxt=JsonParsing.load_File_Into_String("src/test/java/soumission/testSor.json", "UTF-8");
        root = (JSONObject) JSONSerializer.toJSON(jsonTxt);
        assertEquals(root.getBoolean("assurable"),true);
        assertEquals(root.getDouble("montant_annuel"),125667.0,0.0);
        assertEquals(root.getDouble("mensualite"),10629.33,0.0);
        
        String args2[]={"src/test/java/soumission/testEnt2.json","src/test/java/soumission/testSor.json"};
        main(args2);
        jsonTxt=JsonParsing.load_File_Into_String("src/test/java/soumission/testSor.json", "UTF-8");
        root = (JSONObject) JSONSerializer.toJSON(jsonTxt);
        assertEquals(root.getBoolean("assurable"),false);
        /*
        //Avec liste
        String args3[]={"-L",""};
        main(args3);
        //Avec stats
        String args4[]={"-S",""};
        main(args4);*/
        
    }

    
    
    @Test
    public void testMain2() throws Exception {
        JSONObject root;
        String jsonTxt;
        
        String args1[]={"src/test/java/soumission/testEnt2.json","src/test/java/soumission/testSor2.json"};
        main(args1);
        jsonTxt=JsonParsing.load_File_Into_String("src/test/java/soumission/testSor2.json", "UTF-8");
        root = (JSONObject) JSONSerializer.toJSON(jsonTxt);
        assertEquals(root.getBoolean("assurable"),true);
        assertEquals(root.getDouble("montant_annuel"),1850000.0,0.0);
        assertEquals(root.getDouble("mensualite"),154166.66,0.0);
        
        String args2[]={"src/test/java/soumission/testEnt2.json","src/test/java/soumission/testSor2.json"};
        main(args2);
        jsonTxt=JsonParsing.load_File_Into_String("src/test/java/soumission/testSor2.json", "UTF-8");
        root = (JSONObject) JSONSerializer.toJSON(jsonTxt);
        assertEquals(root.getBoolean("assurable"),true);
        /*
        //Avec liste
        String args3[]={"-L",""};
        main(args3);
        //Avec stats
        String args4[]={"-S",""};
        main(args4);*/
        
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
        assertEquals(125667,Index.calculer_Prix_Soumission(soumission1),005);
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
