/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soumission;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

//syntaxe: java -jar dist/Projet-Soumission_Assurance.jar src\soumission\json\fichierEntree1.json src\soumission\json\fichierSortie1.json

public class Index {

    static String fichierEcriture;
    public static void main(String[] args)  throws FileNotFoundException, IOException {
        
         fichierEcriture = args[1];
        
        Soumission<ArrayList> soumission1 = new Soumission<ArrayList>(JsonReader.LoadFile(args[0]));
        
        //Voiture.prixDuVehicule(soumission1)!=-1 est une solution temporaire,idéalement il faudrait
        //créer un fonction qui s'occupe de chercher un véhicule et qui s'il le trouve
        if (Voiture.prixDuVehicule(soumission1)!=-1 && Conducteur.assurable(soumission1) && testDureeContrat(soumission1.getDuree_contrat())){
            double total=calculPrix(soumission1);
            double mensualite=calculMensualite(total);
            JsonWriter.ecriture(true,total,mensualite, fichierEcriture);
        }else{
            JsonWriter.ecriture(false,0,0, fichierEcriture);
        }
        
        //soumission1.display();
    }

    public static boolean testDureeContrat(int duree){

        if (duree >= 1 && duree <= 3){
            return true;
        }else{
            return false;
        }
    }
    
    public static double calculPrix(Soumission<ArrayList> soumission1) throws FileNotFoundException, IOException{
        double total;
        int prixDuVehicule = Voiture.prixDuVehicule(soumission1);

        if(soumission1.getDuree_contrat()==3){
            prixDuVehicule *= 0.85;
        }
        total = (prixDuVehicule * 0.09);
        total += (soumission1.getValeur_des_options() * 0.10);
        
        if (soumission1.getVille().equalsIgnoreCase("Montréal") || soumission1.getVille().equalsIgnoreCase("Longueuil")){
            total += 200;
        }
        if (soumission1.getBurinage().equalsIgnoreCase("Sherlock")){
            total -= 250;
        }
        
        if (soumission1.isGarage_interieur()){
            total -= 500;
        }
        if (soumission1.isSysteme_alarme()){
            total -= 500;
        }
        if (soumission1.isCours_de_conduite_reconnus_par_CAA()){
            total -= 100;
        }
        
        if (soumission1.isPremier_contrat()){
            total += 2000;
        }
        if (soumission1.GetExperience() > 15){
            total -= 400;
        }
                //System.out.println(total);
        return total;
    }
    
    public static double calculMensualite(double total){
        double mensualite;
        mensualite = (total * 1.015)/12;
        
        return mensualite;
    }
}