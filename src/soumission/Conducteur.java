/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soumission;


import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.ArrayList;

/**
 *
 * @author Revold
 */
public class Conducteur {
    
    public static boolean assurable(Soumission<ArrayList> soumission1){
        int ageClient = soumission1.GetAge();
        String provinceClient = soumission1.getProvince();
        
        if(!provinceClient.equalsIgnoreCase("Québec"))
        {
            return false;
        }    
        
        if (soumission1.getSexe() =='M' || soumission1.getSexe() =='m'){
            if (ageClient < 25 || ageClient > 75){
                return false;
            }
        }
                if (soumission1.getSexe() =='F' || soumission1.getSexe() =='f'){
            if (ageClient < 21 || ageClient > 75){
                return false;
            }           
        }
        return true;
    }
}
