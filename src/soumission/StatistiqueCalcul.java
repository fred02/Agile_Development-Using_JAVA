/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soumission;

import java.util.ArrayList;

/**
 *
 * @author Vince
 */
public class StatistiqueCalcul {
    public static void CalculerStatsAssurable(Statistique statistiqueCourante1,Soumission<ArrayList> soumission1){
        
        if (soumission1.get_Conducteur().get_Sexe() == 'm'){
            statistiqueCourante1.set_TotalHomme();
        }
        else{
            statistiqueCourante1.set_TotalFemme();
        }
        statistiqueCourante1.set_TotalVoitureAssurable(soumission1.get_Voitures().length);
        statistiqueCourante1.set_TotalMotoAssurable(soumission1.get_Motos().length);
        
        for(int i = 0; i<soumission1.get_Voitures().length;i++){
            statistiqueCourante1.set_statsVehiculeParMarque(soumission1.get_Voiture(i).get_Marque());   
        }
        for(int i = 0; i<soumission1.get_Motos().length;i++){
            statistiqueCourante1.set_statsVehiculeParMarque(soumission1.get_Moto(i).get_Marque());   
        }
    }
    
    public static void CalculerStatsNonAssurable(Statistique statistiqueCourante2,Soumission<ArrayList> soumission2){
        
        if (soumission2.get_Conducteur().get_Sexe() == 'm'){
            statistiqueCourante2.set_TotalHomme();
        }
        else{
            statistiqueCourante2.set_TotalFemme();
        }
        statistiqueCourante2.set_TotalVehicule(soumission2.get_Voitures().length + soumission2.get_Motos().length);
    }
}
