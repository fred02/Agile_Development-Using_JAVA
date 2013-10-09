
package soumission;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
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
        
    public Soumission(){
        this(0,"","",0,"",false,false,"","","",' ',"",false,false,0);
    }
        
    public Soumission(int annee_1, String marque_1, String modele_1, int valeur_des_options_1,
                String burinage_1, boolean garage_interieur_1, boolean systeme_alarme_1,
                String date_de_naissance_1, String province_1, String ville_1,
                char sexe_1, String date_fin_cours_de_conduite_1, boolean 
                cours_de_conduite_reconnus_par_CAA_1, boolean premier_contrat_1,
                int duree_contrat_1){
                
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
    }
    
    public Soumission(JSONObject json){
        
        JSONObject voiture = json.getJSONObject("voiture");
        JSONObject conducteur = json.getJSONObject("conducteur");
        
        annee=voiture.getInt("annee");
        marque=voiture.getString("marque");
        modele=voiture.getString("modele");
        valeur_des_options=voiture.getInt("valeur_des_options");
        burinage=voiture.getString("burinage");
        garage_interieur=voiture.getBoolean("garage_interieur");
        systeme_alarme=voiture.getBoolean("systeme_alarme");
            
        date_de_naissance=conducteur.getString("date_de_naissance");
        province=conducteur.getString("province");
        ville=conducteur.getString("ville");
        sexe=conducteur.getString("sexe").charAt(0);
        date_fin_cours_de_conduite=conducteur.getString("date_fin_cours_de_conduite");
        cours_de_conduite_reconnus_par_CAA=conducteur.getBoolean("cours_de_conduite_reconnus_par_CAA");
        premier_contrat=conducteur.getBoolean("premier_contrat");
            
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
        
        date_de_naissance=soumission1.getDate_de_naissance();
        province=soumission1.getProvince();
        ville=soumission1.getVille();
        sexe=soumission1.getSexe();
        date_fin_cours_de_conduite=soumission1.getDate_fin_cours_de_conduite();
        cours_de_conduite_reconnus_par_CAA=soumission1.isCours_de_conduite_reconnus_par_CAA();
        premier_contrat=soumission1.isPremier_contrat();
        
        duree_contrat=soumission1.getDuree_contrat(); 
    }
    

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
