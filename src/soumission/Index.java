/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soumission;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Revold
 */
public class Index {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws FileNotFoundException, IOException {
        
        
        // pour faire rouler le programme en ligne de commande il faut taper
        // java -jar dist/Projet-Soumission_Assurance.jar fichierEntree1.json le_nom_de_votre_choix.json
        if (args.length < 2) {
            System.out.println("Nombre d'arguments insuffisants !! ");
            return;
        }
        
        args[0] = "src/soumission/Json/fichierEntree1.json";
        String fichierSortieJson = args[1];         
        
        
        Soumission<ArrayList> soumission1 = new Soumission<ArrayList>(JsonReader.LoadFile(args[0]));
        
        double valSoumission = 0;
        if (Conducteur.ageValide(soumission1) && testDureeContrat(soumission1.getDuree_contrat())){
            valSoumission = calculPrix(soumission1);
        }else{
            JsonWriter.ecriture(false,0,0,null);
        }
         
        double mensualite = (valSoumission * 1.015)/12;
        JsonWriter.ecriture(true,valSoumission ,mensualite,fichierSortieJson);
        soumission1.display();
        
    } // fin main

    public static boolean testDureeContrat(int duree){

        if (duree == 1 || duree == 2 || duree == 3){
            return true;
        }else{
            return false;
        }
    }
    
    /**
     *
     * @param soumission1
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     */
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
        return total;
    }
    
    
//    public static void calculMensualite(double total){
//        double mensualite;
//        mensualite = (total * 1.015)/12;
//        JsonWriter.ecriture(true,total,mensualite,fichierSortieJson);
//    }
    
    
    
}