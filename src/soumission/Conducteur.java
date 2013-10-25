package soumission;

import java.util.GregorianCalendar;
import java.util.Calendar;
import net.sf.json.JSONObject;

public class Conducteur {
    
    private String date_de_naissance;
    private String province;
    private String ville;
    private char sexe;
    private String date_fin_cours_de_conduite;
    private boolean cours_de_conduite_reconnus_par_CAA;
    private boolean premier_contrat;
    private boolean membre_oiq;
    
    public Conducteur()
    {
        this("","","",' ',"",false,false,false);
    }
    
    
    public Conducteur(String date_de_naissance_1, String province_1, String ville_1,char sexe_1,
            String date_fin_cours_de_conduite_1, boolean cours_de_conduite_reconnus_par_CAA_1,
            boolean premier_contrat_1,boolean membre_ordreIq){
        date_de_naissance=date_de_naissance_1;
        province=province_1;
        ville=ville_1;
        sexe=sexe_1;
        date_fin_cours_de_conduite=date_fin_cours_de_conduite_1;
        cours_de_conduite_reconnus_par_CAA=cours_de_conduite_reconnus_par_CAA_1;
        premier_contrat=premier_contrat_1;
        membre_oiq = membre_ordreIq;
    }
    
    public Conducteur(JSONObject json){
        date_de_naissance=json.getString("date_de_naissance");
        province=json.getString("province");
        ville=json.getString("ville");
        sexe=json.getString("sexe").charAt(0);
        date_fin_cours_de_conduite=json.getString("date_fin_cours_de_conduite");
        cours_de_conduite_reconnus_par_CAA=json.getBoolean("cours_de_conduite_reconnus_par_CAA");
        premier_contrat=json.getBoolean("premier_contrat");
        membre_oiq = json.getBoolean("membre_oiq");
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
    
    public static boolean assurable(Conducteur conducteur){
        int ageClient = conducteur.GetAge();
        String provinceClient = conducteur.getProvince();
        
        if(!provinceClient.equalsIgnoreCase("Québec"))
        {
            return false;
        }    
        
        if (conducteur.getSexe() =='M' || conducteur.getSexe() =='m'){
            if (ageClient < 25 || ageClient > 75){
                return false;
            }
        }
                if (conducteur.getSexe() =='F' || conducteur.getSexe() =='f'){
            if (ageClient < 21 || ageClient > 75){
                return false;
            }           
        }
        return true;
    }
}
