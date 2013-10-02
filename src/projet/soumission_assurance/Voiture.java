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
    
    private int annee;
    private String marque;
    private String modele;
    private int valeur_des_options;
    private String burinage;
    private boolean garage_interieur;
    private boolean systeme_alarme;
    
    public Voiture(int a, String ma, String mo, int v, String b, boolean g, boolean s){
        annee = a; 
        marque = ma; 
        modele = mo; 
        valeur_des_options = v; 
        burinage = b; 
        garage_interieur = g; 
        systeme_alarme = s;
    }
    
    public int getAnnee(){
        return annee;
    }
    
    public String getMarque(){
        return marque;
    }
    
    public String getModele(){
        return modele;
    }
    
    public int getValeur_des_options(){
        return valeur_des_options;
    }
    
    public String getBurinage(){
        return burinage;
    }
    
    public boolean getGarage_interieur(){
        return garage_interieur;
    }
    
    public boolean getSysteme_alarme(){
        return systeme_alarme;
    }
    
    /*
     * @fonction validerVehicule
     *  fonction qui va valider au depart si le vehicule est assurable ou non
     * @parametre : annee et marque
     * @valeur retour : valeur booleenne true si assurable False sinon
     */ 
    /*boolean validerVehicule (int annee_V, String marque_V)
    
    {
        boolean assurable = true;
        
        if (annee_V != 2014 ||  ((marque_V.equalsIgnoreCase("Porsche") ==false) ))
        {
        
          assurable =false;
        
        } 
        
        return assurable;
    
    }*/
    
        
}// fin classe Voiture
