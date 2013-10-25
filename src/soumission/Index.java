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
        
        if (soumission1.getAssurable() && testDureeContrat(soumission1.getDuree_contrat())){
            double total=calculPrixSoumission(soumission1);
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
    
    public static double calculPourcentageDeBase (int age, char sexe)
    {
        double pourcentage = 0;
        
        if (  sexe=='F' || sexe=='f') {
        
            if (age >= 21 && age <=40)
                pourcentage=0.11;
            if (age >= 41 && age <=65)
                pourcentage=0.09;
            if (age >= 66 && age <=75)
                pourcentage=0.155;
        }
        if (  sexe=='M' || sexe=='m') {
        
            if (age >= 25 && age <=35)
                pourcentage=0.15;
            if (age >= 36 && age <=60)
                pourcentage=0.12;
            if (age >= 61 && age <=75)
                pourcentage=0.135;
        }
    
      return pourcentage;
    }
    
    
    
    public static double calculPrixSoumission(Soumission<ArrayList> soumission1) throws FileNotFoundException, IOException{
        double total=0;
        Conducteur conducteur=soumission1.getConducteur();
        for(int i=0;i<soumission1.getNbVoitures();i++)
        {
            Voiture voiture=soumission1.getVoiture(i);
            total+=calculPrixVehicule(conducteur,voiture,soumission1.getDuree_contrat());
        }
        for(int i=0;i<soumission1.getNbMotos();i++)
        {
            Moto moto=soumission1.getMoto(i);
            total+=calculPrixVehicule(conducteur,moto,soumission1.getDuree_contrat());
        }
        //System.out.println(total);
        return total;
    }
    
    public static double calculPrixVehicule(Conducteur conducteur,Vehicule vehicule,int duree_Contrat) throws FileNotFoundException, IOException{
        double total=0;
        
        int prixDuVehicule = vehicule.getValeur_Initiale();
        double pourcent = calculPourcentageDeBase (conducteur.GetAge(), conducteur.getSexe());
        if(vehicule instanceof Moto)
        {
            pourcent+=0.14;
        }
        
        if(duree_Contrat==3){
            prixDuVehicule *= 0.85;
        }
        total = (prixDuVehicule * pourcent);
        total += (vehicule.getValeur_des_options() * 0.10);

        if (conducteur.getVille().equalsIgnoreCase("Montréal") || conducteur.getVille().equalsIgnoreCase("Longueuil")){
            total += 200;
        }
        if (vehicule.getBurinage().equalsIgnoreCase("Sherlock")){
            total -= 250;
        }

        if (vehicule.isGarage_interieur()){
            total -= 500;
        }
        if (vehicule.isSysteme_alarme()){
            total -= 500;
        }
        if (conducteur.isCours_de_conduite_reconnus_par_CAA()){
            total -= 100;
        }

        if (conducteur.isPremier_contrat()){
            total += 2000;
        }
        if (conducteur.GetExperience() > 15){
            total -= 400;
        }
        
        if (vehicule.getValeur_Initiale()>500000)
        {
            total += 2500;
        }
        
        if(vehicule instanceof Moto)
        {
            if(((Moto)vehicule).getCc()>1100)
            {
                total += 1000;
            }
        }
        
        if (conducteur.isMembre_oiq())
        {
            total*=0.9;
        }
        return total;
    }
    public static double calculMensualite(double total){
        double mensualite;
        mensualite = (total * 1.015)/12;
        
        return mensualite;
    }
}