/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soumissionAss;

import java.util.ArrayList;

/**
 *
 * @author Vince
 */
public class StatistiqueCalcul {
    public static void CalculerStatsAssurable(Statistique statistiqueCourante1,Soumission<ArrayList> soumission1){
        statistiqueCourante1.set_TotalSoumission();
        statistiqueCourante1.set_TotalAssurable();
        
        if (soumission1.get_Conducteur().get_Sexe() == 'm' || soumission1.get_Conducteur().get_Sexe() == 'M'){
            statistiqueCourante1.set_TotalHomme();
        }
        else{
            statistiqueCourante1.set_TotalFemme();
        }
        statistiqueCourante1.set_TotalVoitureAssurable(soumission1.get_Voitures().length);
        statistiqueCourante1.set_TotalMotoAssurable(soumission1.get_Motos().length);
        
        for(int i = 0; i<soumission1.get_Voitures().length;i++){
            statistiqueCourante1.set_statsVehiculeParMarque(soumission1.get_Voiture(i).get_Marque());
            if (soumission1.get_Voiture(i).get_Valeur_Initiale()> 1000000){
                statistiqueCourante1.set_VehiculesValeurMillion();
            }
            else if(soumission1.get_Voiture(i).get_Valeur_Initiale()>= 500000){
                statistiqueCourante1.set_VehiculesValeurDemiMillion();
            }
        }
        for(int i = 0; i<soumission1.get_Motos().length;i++){
            statistiqueCourante1.set_statsVehiculeParMarque(soumission1.get_Moto(i).get_Marque());   
        }
        
        statistiqueCourante1.set_TotalVehicule(soumission1.get_Voitures().length + soumission1.get_Motos().length);
    }
    
    public static void CalculerStatsNonAssurable(Statistique statistiqueCourante2,Soumission<ArrayList> soumission2){
        statistiqueCourante2.set_TotalSoumission();
        statistiqueCourante2.set_TotalNonAssurable();
        
        if (soumission2.get_Conducteur().get_Sexe() == 'm' || soumission2.get_Conducteur().get_Sexe() == 'M'){
            statistiqueCourante2.set_TotalHomme();
        }
        else{
            statistiqueCourante2.set_TotalFemme();
        }
        
        statistiqueCourante2.set_TotalVehicule(soumission2.get_Voitures().length + soumission2.get_Motos().length);
    }
}
