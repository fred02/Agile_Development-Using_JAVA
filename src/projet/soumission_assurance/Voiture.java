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
    
    /*
     * @fonction retournerValeurVoiture
     * fonction qui va retourner la valeur init du vehicule
     * @parametre : modele
     * @valeur retour : valeur vehicule
     */
    int retournerValeurVoiture (String modele_V)
    {
     int valeur = 0;
     
        if (modele_V.equalsIgnoreCase("Boxter") )
        {
           valeur= 60000  ;
        }
          
        if (modele_V.equalsIgnoreCase("Boxter S"))
        {
           valeur= 72000   ;
        }
        
        if (modele_V.equalsIgnoreCase("Cayman"))
        {
           valeur= 62000  ;
        }
        
        if (modele_V.equalsIgnoreCase("Cayman S"))
        {
           valeur= 75000  ;
        }
        
        if (modele_V.equalsIgnoreCase( "911 Carrera"))
        {
           valeur= 100000  ;
        }
        if (modele_V.equalsIgnoreCase("911 Carrera S"))
        {
           valeur= 115000  ;
        }
        if (modele_V.equalsIgnoreCase("911 Carrera Cabriolet"))
        {
           valeur= 112000  ;
        }
        if (modele_V.equalsIgnoreCase("911 Carrera S Cabriolet"))
        {
           valeur= 129000  ;
        }
        if (modele_V.equalsIgnoreCase("911 Carrera 4"))
        {
           valeur= 106000  ;
        }
        if (modele_V.equalsIgnoreCase("911 Carrera 4S"))
        {
           valeur= 123000  ;
        }
        if (modele_V.equalsIgnoreCase("911 Carrera 4 Cabriolet"))
        {
           valeur= 120000  ;
        }
        if (modele_V.equalsIgnoreCase("911 Carrera 4S Cabriolet"))
        {
           valeur= 137000  ;
        }
        if (modele_V.equalsIgnoreCase("911 50 ans"))
        {
           valeur= 142000  ;
        }
        if (modele_V.equalsIgnoreCase("911 Turbo"))
        {
           valeur= 170000  ;
        }
        if (modele_V.equalsIgnoreCase("911 Turbo S"))
        {
           valeur= 207000   ;
        }
        if (modele_V.equalsIgnoreCase("911 GT3"))
        {
           valeur= 149000   ;
        }
        if (modele_V.equalsIgnoreCase("Panamera"))
        {
           valeur= 90000  ;
        }
        if (modele_V.equalsIgnoreCase("Panamera 4"))
        {
           valeur= 95000  ;
        }
        if (modele_V.equalsIgnoreCase("Panamera S"))
        {
           valeur= 107000  ;
        }
        if (modele_V.equalsIgnoreCase("Panamera S E-Hybride"))
        {
           valeur= 114000  ;
        }
        if (modele_V.equalsIgnoreCase("Panamera 4S"))
        {
           valeur= 113000  ;
        }
        if (modele_V.equalsIgnoreCase("Panamera 4S Executive"))
        {
           valeur= 144000  ;
        }
        if (modele_V.equalsIgnoreCase("Panamera GTS"))
        {
           valeur= 130000  ;
        }
        if (modele_V.equalsIgnoreCase("Panamera Turbo"))
        {
           valeur= 162000  ;
        }
        if (modele_V.equalsIgnoreCase("Panamera Turbo Executive"))
        {
           valeur= 185000  ;
        }
        if (modele_V.equalsIgnoreCase("Cayenne"))
        {
           valeur= 59000  ;
        }
        if (modele_V.equalsIgnoreCase("Cayenne Diesel"))
        {
           valeur= 67000  ;
        }
        if (modele_V.equalsIgnoreCase("Cayenne S"))
        {
           valeur= 77000  ;
        }
        if (modele_V.equalsIgnoreCase("Cayenne Diesel"))
        {
           valeur= 67000  ;
        }
        if (modele_V.equalsIgnoreCase("Cayenne S"))
        {
           valeur= 77000  ;
        }
        if (modele_V.equalsIgnoreCase("Cayenne S Hybride"))
        {
           valeur= 82000  ;
        }
        if (modele_V.equalsIgnoreCase("Cayenne GTS"))
        {
           valeur= 96000  ;
        }
        if (modele_V.equalsIgnoreCase("Cayenne Turbo"))
        {
           valeur= 125000  ;
        }
        if (modele_V.equalsIgnoreCase("Cayenne Turbo S"))
        {
           valeur= 169000  ;
        }
        return valeur;
        
    }
    
}// fin classe Voiture
