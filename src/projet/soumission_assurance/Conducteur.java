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
    
    
    /*
     * @fonction 
     * fonction qui va retourner 
     * @parametre : 
     * @valeur retour : 
     */
    boolean validerAdmissConducteur (String province,char sexe,int age)
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
    }
    
} // classe Conducteur
