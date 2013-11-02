
package soumission;

/**
 * Cours: INF2015 Enseignant: Jacques Berger
 *
 * Projet pour DDC #1
 *
 * Equipe 8 Etudiants:
 *
 * Gabriel Jourdenais-Hamel JOUG08108901 
 * Fahd Kacem               KACF21038103 
 * Jonathan Drolet          DROJ13078506
 * Vincent Lavoie           LAVV07068909
 */

class VehiculeStats {
    private String marque;
    private int nombre;
    
    public VehiculeStats(String nomDeLaMarque){
        marque = nomDeLaMarque;
        nombre = 1;
    }
    
    public VehiculeStats(String nomDeLaMarque, int nombreDeLaMarque){
        marque = nomDeLaMarque;
        nombre = nombreDeLaMarque;
    }
    
    public void incrementerLeVehicule(){
        nombre++;
    }
    
}
