/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.soumission_assurance;

/**
 *
 * @author account
 */
public class Conducteur {
    
    private String date_de_naissance;
    private String province;
    private String ville;
    private String sexe;
    private String date_fin_cours_de_conduite;
    private boolean cours_de_conduite_reconnus_par_CAA;
    private boolean premier_contrat;
    
    public Conducteur(String d, String p, String v, String s, String da, boolean c, boolean pc){
        date_de_naissance = d;
        province = p;
        ville = v;
        sexe = s;
        date_fin_cours_de_conduite = da;
        cours_de_conduite_reconnus_par_CAA = c;
        premier_contrat =pc;
    } 
    
    public String getDate_de_naissance(){
        return date_de_naissance;
    }
    
    public String getProvince(){
        return province;
    }
    
    public String getVille(){
        return ville;
    }
    
    public String getSexe(){
        return sexe;
    }
    
    public String getDate_fin_cours_de_conduite(){
        return date_fin_cours_de_conduite;
    }
    
    public boolean getCours_de_conduite_reconnus_par_CAA(){
        return cours_de_conduite_reconnus_par_CAA;
    }
    
    public boolean getPremier_contrat(){
        return premier_contrat;
    }
    /*boolean validerAdmissConducteur (String province,char sexe,int age)
    {
    
         boolean valide =true;
         
         if (province.equalsIgnoreCase("Quebec") ==false) 
         {
             valide =false;
         }
         
         if ( sexe == 'M' && age < 25)
         {
             valide =false; 
         }
         
         if ( sexe == 'F' && age < 21)
         {
             valide =false; 
         }
         
         if ( (sexe == 'M' || sexe == 'F') && (age > 75) )
         {
             valide =false; 
         }
    
         return valide;
    }*/
    
} // classe Conducteur
