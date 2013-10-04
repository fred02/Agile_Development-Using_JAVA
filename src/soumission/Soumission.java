
package soumission;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

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
        private boolean assurable;
        private int montant_annuel;
        private int mensualite;
       
    public Soumission(int annee_1, String marque_1, String modele_1, int valeur_des_options_1,
                String burinage_1, boolean garage_interieur_1, boolean systeme_alarme_1,
                String date_de_naissance_1, String province_1, String ville_1,
                char sexe_1, String date_fin_cours_de_conduite_1, boolean 
                cours_de_conduite_reconnus_par_CAA_1, boolean premier_contrat_1,
                int duree_contrat_1){
                
        setAnnee(annee_1);
        setMarque(marque_1);
        setModele(modele_1);
        setValeur_des_options(valeur_des_options_1);
        setBurinage(burinage_1);
        setGarage_interieur(garage_interieur_1);
        setSysteme_alarme(systeme_alarme_1);
        setDate_de_naissance(date_de_naissance_1);
        setProvince(province_1);
        setVille(ville_1);
        setSexe(sexe_1);
        setDate_fin_cours_de_conduite(date_fin_cours_de_conduite_1);
        setCours_de_conduite_reconnus_par_CAA(cours_de_conduite_reconnus_par_CAA_1);
        setPremier_contrat(premier_contrat_1);
        setDuree_contrat(duree_contrat_1);        
        setAssurable(false);
        setMontant_annuel(0);
        setMensualite(0);
        
        }
    
    public Soumission(){
        
    }
    
    public Soumission(Soumission<ArrayList> soumission1){
        
        setAnnee(soumission1.getAnnee());
        setMarque(soumission1.getMarque());
        setModele(soumission1.getModele());
        setValeur_des_options(soumission1.getValeur_des_options());
        setBurinage(soumission1.getBurinage());
        setGarage_interieur(soumission1.isGarage_interieur());
        setSysteme_alarme(soumission1.isSysteme_alarme());
        setDate_de_naissance(soumission1.getDate_de_naissance());
        setProvince(soumission1.getProvince());
        setVille(soumission1.getVille());
        setSexe(soumission1.getSexe());
        setDate_fin_cours_de_conduite(soumission1.getDate_fin_cours_de_conduite());
        setCours_de_conduite_reconnus_par_CAA(soumission1.isCours_de_conduite_reconnus_par_CAA());
        setPremier_contrat(soumission1.isPremier_contrat());
        setDuree_contrat(soumission1.getDuree_contrat()); 
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getValeur_des_options() {
        return valeur_des_options;
    }

    public void setValeur_des_options(int valeur_des_options) {
        this.valeur_des_options = valeur_des_options;
    }

    public String getBurinage() {
        return burinage;
    }

    public void setBurinage(String burinage) {
        this.burinage = burinage;
    }

    public boolean isGarage_interieur() {
        return garage_interieur;
    }

    public void setGarage_interieur(boolean garage_interieur) {
        this.garage_interieur = garage_interieur;
    }

    public boolean isSysteme_alarme() {
        return systeme_alarme;
    }

    public void setSysteme_alarme(boolean systeme_alarme) {
        this.systeme_alarme = systeme_alarme;
    }

    public String getDate_de_naissance() {
        return date_de_naissance;
    }

    public void setDate_de_naissance(String date_de_naissance) {
        this.date_de_naissance = date_de_naissance;
    }
    
        public GregorianCalendar GetAgeGC(){
        int annee = Integer.valueOf(date_de_naissance.substring(0, 4));
        int mois = Integer.valueOf(date_de_naissance.substring(5, 7));
        int jour = Integer.valueOf(date_de_naissance.substring(8, 10));
        GregorianCalendar client = new GregorianCalendar(annee,mois,jour);
        
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

    public void setProvince(String province) {
        this.province = province;
    }

    public String getVille() {
        return ville;
    }
    
    public void setVille(String ville) {
        this.ville = ville;
    }

    public char getSexe() {
        return sexe;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    public String getDate_fin_cours_de_conduite() {
        return date_fin_cours_de_conduite;
    }

    public void setDate_fin_cours_de_conduite(String date_fin_cours_de_conduite) {
        this.date_fin_cours_de_conduite = date_fin_cours_de_conduite;
    }
    
    public GregorianCalendar GetDate_fin_cours_GC(){
        int annee = Integer.valueOf(date_de_naissance.substring(0, 4));
        int mois = Integer.valueOf(date_de_naissance.substring(5, 7));
        int jour = Integer.valueOf(date_de_naissance.substring(8, 10));
        GregorianCalendar client = new GregorianCalendar(annee,mois,jour);
        
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

    public void setCours_de_conduite_reconnus_par_CAA(boolean cours_de_conduite_reconnus_par_CAA) {
        this.cours_de_conduite_reconnus_par_CAA = cours_de_conduite_reconnus_par_CAA;
    }

    public boolean isPremier_contrat() {
        return premier_contrat;
    }

    public void setPremier_contrat(boolean premier_contrat) {
        this.premier_contrat = premier_contrat;
    }
   
    public int getDuree_contrat() {
        return duree_contrat;
    }

    public void setDuree_contrat(int duree_contrat) {
        this.duree_contrat = duree_contrat;
    }
    public boolean isAssurable() {
        return assurable;
    }

    public void setAssurable(boolean assurable) {
        this.assurable = assurable;
    }
    
    public int getMontant_annuel() {
        return montant_annuel;
    }

    public void setMontant_annuel(int montant_annuel) {
        this.montant_annuel = montant_annuel;
    }
    
    public int getMensualite() {
        return mensualite;
    }

    public void setMensualite(int mensualite) {
        this.mensualite = mensualite;
    }
        
    public void display(){
        System.out.print(this.marque+" - test -  "+this.getDate_de_naissance());
    }
    
        
}
