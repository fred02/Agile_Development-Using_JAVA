/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.soumission_assurance;

/**
 *
 * @author account
 */
public class Voiture {
    
    /*
     * il se peut que la declaration de ces variables soit inutile
     */
    public int annee;
    public String marque;
    public String modele;
    public int valeur;
    public int valeur_des_options;
    public String burinage;
    public boolean garage_interieur;
    public boolean systeme_alarme;
    
    
    /*
     * @fonction validerVehicule
     *  fonction qui va valider au depart si le vehicule est assurable ou non
     * @parametre : annee et marque
     * @valeur retour : valeur booleenne true si assurable False sinon
     */ 
    boolean validerVehicule (int annee_V, String marque_V)
    
    {
        boolean assurable = true;
        
        if (annee_V != 2014 ||  ((marque_V.equalsIgnoreCase("Porsche") ==false) ))
        {
        
          assurable =false;
        
        } 
        
        return assurable;
    
    }
    
        
}// fin classe Voiture
