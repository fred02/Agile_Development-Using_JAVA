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
        
        if (Conducteur.ageValide(soumission1) && testDureeContrat(soumission1.getDuree_contrat())){
            calculPrix(soumission1);
        }else{
            JsonWriter.ecriture(false,0,0, fichierEcriture);
        }
        
        soumission1.display();
    }

    public static boolean testDureeContrat(int duree){

        if (duree == 1 || duree == 2 || duree == 3){
            return true;
        }else{
            return false;
        }
    }
    
    public static void calculPrix(Soumission<ArrayList> soumission1) throws FileNotFoundException, IOException{
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
        if (soumission1.getSexe() == 'F' || soumission1.getSexe() == 'f'){
            total -= 1000;
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
        if (soumission1.getSexe() == 'M' || soumission1.getSexe() == 'm'){
            if (soumission1.GetAge()<35){
                total += 1000;
            }
        }
        if (soumission1.isPremier_contrat()){
            total += 2000;
        }
        if (soumission1.GetExperience() > 15){
            total -= 400;
        }
                System.out.println(total);
        calculMensualite(total);
    }
    
    public static void calculMensualite(double total){
        double mensualite;
        mensualite = (total * 1.015)/12;
        
        JsonWriter.ecriture(true,total,mensualite, fichierEcriture);
    }
}