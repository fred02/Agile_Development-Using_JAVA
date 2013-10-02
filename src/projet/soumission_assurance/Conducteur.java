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
    
    public Conducteur(){}
    public String date_de_naissance;
    public String province;
    public String ville;
    public String sexe;
    public String date_fin_cours_de_conduite;
    public boolean cours_de_conduite_reconnus_par_CAA;
    public boolean premier_contrat;
    
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
