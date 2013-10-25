
package soumission;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class Soumission<T extends ArrayList> {
    
        private int annee;
        private String marque;
        private String modele;
        private int valeur_des_options;
        private String burinage;
        private boolean garage_interieur;
        private boolean systeme_alarme;
        private String date_de_naissance;
        private String province;
        private String ville;
        private char sexe;
        private String date_fin_cours_de_conduite;
        private boolean cours_de_conduite_reconnus_par_CAA;
        private boolean premier_contrat;
        private int duree_contrat; 
        
        // variables ajoutees apres modification du client
        private int anneeMoto;
        private String marqueMoto;
        private String modeleMoto;
        private int valeur_des_optionsMoto;
        private String burinageMoto;
        private boolean garage_interieurMoto;
        private boolean systeme_alarmeMoto;
        
        private boolean membre_oiq;
        
        
    public Soumission(){
        this(0,"","",0,"",false,false,"","","",' ',"",false,false,0,0,"","",0,"",false,false,false);
    }
        
    public Soumission(int annee_1, String marque_1, String modele_1, int valeur_des_options_1,
                String burinage_1, boolean garage_interieur_1, boolean systeme_alarme_1,
                String date_de_naissance_1, String province_1, String ville_1,
                char sexe_1, String date_fin_cours_de_conduite_1, boolean 
                cours_de_conduite_reconnus_par_CAA_1, boolean premier_contrat_1,
                int duree_contrat_1,
                int annee_1_Moto, String marque_1_Moto, String modele_1_Moto, int valeur_des_options_1_Moto,
                String burinage_1_Moto, boolean garage_interieur_1_Moto, boolean systeme_alarme_1_Moto,boolean membre_ordreIq ){
                
        annee=annee_1;
        marque=marque_1;
        modele=modele_1;
        valeur_des_options=valeur_des_options_1;
        burinage=burinage_1;
        garage_interieur=garage_interieur_1;
        systeme_alarme=systeme_alarme_1;
        
        date_de_naissance=date_de_naissance_1;
        province=province_1;
        ville=ville_1;
        sexe=sexe_1;
        date_fin_cours_de_conduite=date_fin_cours_de_conduite_1;
        cours_de_conduite_reconnus_par_CAA=cours_de_conduite_reconnus_par_CAA_1;
        premier_contrat=premier_contrat_1;
        
        duree_contrat=duree_contrat_1;
        
        // nouveaux ajouts
        anneeMoto = annee_1_Moto;
        marqueMoto = marque_1_Moto;
        modeleMoto = modele_1_Moto;
        valeur_des_optionsMoto = valeur_des_options_1_Moto;
        burinageMoto =burinage_1_Moto;
        garage_interieurMoto = garage_interieur_1_Moto;
        systeme_alarmeMoto = systeme_alarme_1_Moto;
        
        membre_oiq = membre_ordreIq;
        
        
        
    }
    
    public Soumission(JSONObject json){
        
        //JSONObject voitures = json.getJSONObject("voitures");
        // modification de l'objet en un tableau d'objet json
        JSONArray voitures = json.getJSONArray("voitures");
        
        JSONObject conducteur = json.getJSONObject("conducteur");
        
        JSONArray motos = json.getJSONArray("motos");
        
        
       for (int i = 0; i < voitures.size() ; ++i) { 
           JSONObject tabVoitures = voitures.getJSONObject(i);
      
        annee=tabVoitures.getInt("annee");
        marque=tabVoitures.getString("marque");
        modele=tabVoitures.getString("modele");
        valeur_des_options=tabVoitures.getInt("valeur_des_options");
        burinage=tabVoitures.getString("burinage");
        garage_interieur=tabVoitures.getBoolean("garage_interieur");
        systeme_alarme=tabVoitures.getBoolean("systeme_alarme");
       } // for tableau voitures
        
       for (int j = 0; j < motos.size() ; ++j) { 
           JSONObject tabMotos = motos.getJSONObject(j);
      
        anneeMoto=tabMotos.getInt("annee");
        marqueMoto=tabMotos.getString("marque");
        modeleMoto=tabMotos.getString("modele");
        valeur_des_optionsMoto=tabMotos.getInt("valeur_des_options");
        burinageMoto=tabMotos.getString("burinage");
        garage_interieurMoto=tabMotos.getBoolean("garage_interieur");
        systeme_alarmeMoto=tabMotos.getBoolean("systeme_alarme");
       } // for tableau motos
        
        date_de_naissance=conducteur.getString("date_de_naissance");
        province=conducteur.getString("province");
        ville=conducteur.getString("ville");
        sexe=conducteur.getString("sexe").charAt(0);
        date_fin_cours_de_conduite=conducteur.getString("date_fin_cours_de_conduite");
        cours_de_conduite_reconnus_par_CAA=conducteur.getBoolean("cours_de_conduite_reconnus_par_CAA");
        premier_contrat=conducteur.getBoolean("premier_contrat");
        membre_oiq = conducteur.getBoolean("membre_oiq");
            
        duree_contrat=json.getInt("duree_contrat");
        
        
    }
    
    public Soumission(Soumission<ArrayList> soumission1){
        
        annee=soumission1.getAnnee();
        marque=soumission1.getMarque();
        modele=soumission1.getModele();
        valeur_des_options=soumission1.getValeur_des_options();
        burinage=soumission1.getBurinage();
        garage_interieur=soumission1.isGarage_interieur();
        systeme_alarme=soumission1.isSysteme_alarme();
        
        anneeMoto=soumission1.getAnneeMoto();
        marqueMoto=soumission1.getMarqueMoto();
        modeleMoto=soumission1.getModeleMoto();
        valeur_des_optionsMoto=soumission1.getValeur_des_optionsMoto();
        burinageMoto=soumission1.getBurinageMoto();
        garage_interieurMoto=soumission1.isGarage_interieurMoto();
        systeme_alarmeMoto=soumission1.isSysteme_alarmeMoto();
        
        date_de_naissance=soumission1.getDate_de_naissance();
        province=soumission1.getProvince();
        ville=soumission1.getVille();
        sexe=soumission1.getSexe();
        date_fin_cours_de_conduite=soumission1.getDate_fin_cours_de_conduite();
        cours_de_conduite_reconnus_par_CAA=soumission1.isCours_de_conduite_reconnus_par_CAA();
        premier_contrat=soumission1.isPremier_contrat();
        membre_oiq=soumission1.isMembre_oiq();
        
        duree_contrat=soumission1.getDuree_contrat(); 
    }
    
    // les ajouts pour les getters (motos)
    public int getAnneeMoto() {
        return anneeMoto;
    }

    public String getMarqueMoto() {
        return marqueMoto;
    }

    public String getModeleMoto() {
        return modeleMoto;
    }

    public int getValeur_des_optionsMoto() {
        return valeur_des_optionsMoto;
    }

    public String getBurinageMoto() {
        return burinageMoto;
    }

    public boolean isGarage_interieurMoto() {
        return garage_interieurMoto;
    }

    public boolean isSysteme_alarmeMoto() {
        return systeme_alarmeMoto;
    }

    
    // les getters pour voitures et conducteurs
    public int getAnnee() {
        return annee;
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public int getValeur_des_options() {
        return valeur_des_options;
    }

    public String getBurinage() {
        return burinage;
    }

    public boolean isGarage_interieur() {
        return garage_interieur;
    }

    public boolean isSysteme_alarme() {
        return systeme_alarme;
    }

    public String getDate_de_naissance() {
        return date_de_naissance;
    }
 
    public boolean isMembre_oiq() {
        return membre_oiq;
    } 
    
    
    public GregorianCalendar GetAgeGC(){
        int d_annee = Integer.valueOf(date_de_naissance.substring(0, 4));
        int d_mois = Integer.valueOf(date_de_naissance.substring(5, 7));
        int d_jour = Integer.valueOf(date_de_naissance.substring(8, 10));
        GregorianCalendar client = new GregorianCalendar(d_annee,d_mois,d_jour);
        
        return client;
    }
    
    public int GetAge(){
            
        Calendar client = GetAgeGC();
        Calendar maintenant = new GregorianCalendar();
        
        int ageClient =  maintenant.get(Calendar.YEAR) - client.get(Calendar.YEAR);
        if((client.get(Calendar.MONTH) > maintenant.get(Calendar.MONTH))
            || (client.get(Calendar.MONTH) == maintenant.get(Calendar.MONTH)
            && client.get(Calendar.DAY_OF_MONTH) > maintenant.get(Calendar.DAY_OF_MONTH))){
                ageClient--;
        }
        
        return ageClient;
    }

    public String getProvince() {
        return province;
    }

    public String getVille() {
        return ville;
    }

    public char getSexe() {
        return sexe;
    }

    public String getDate_fin_cours_de_conduite() {
        return date_fin_cours_de_conduite;
    }

    public GregorianCalendar GetDate_fin_cours_GC(){
        int d_annee = Integer.valueOf(date_fin_cours_de_conduite.substring(0, 4));
        int d_mois = Integer.valueOf(date_fin_cours_de_conduite.substring(5, 7));
        int d_jour = Integer.valueOf(date_fin_cours_de_conduite.substring(8, 10));
        GregorianCalendar client = new GregorianCalendar(d_annee,d_mois,d_jour);
        
        return client;
    }
    
    public int GetExperience(){
            
        Calendar client = GetDate_fin_cours_GC();
        Calendar maintenant = new GregorianCalendar();
        
        int ageClient =  maintenant.get(Calendar.YEAR) - client.get(Calendar.YEAR);
        if((client.get(Calendar.MONTH) > maintenant.get(Calendar.MONTH))
            || (client.get(Calendar.MONTH) == maintenant.get(Calendar.MONTH)
            && client.get(Calendar.DAY_OF_MONTH) > maintenant.get(Calendar.DAY_OF_MONTH))){
                ageClient--;
        }
        
        return ageClient;
    }

    public boolean isCours_de_conduite_reconnus_par_CAA() {
        return cours_de_conduite_reconnus_par_CAA;
    }

    public boolean isPremier_contrat() {
        return premier_contrat;
    }

    public int getDuree_contrat() {
        return duree_contrat;
    }
        
    public void display(){
        System.out.print(this.marque+" - test -  "+this.getDate_de_naissance());
    }
}
