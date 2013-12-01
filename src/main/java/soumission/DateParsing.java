/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soumission;

import java.util.GregorianCalendar;

/**
 *
 * @author Gabriel
 */
public class DateParsing {
    public static GregorianCalendar stringToCalendar(String chaine){
        int d_annee = Integer.valueOf(chaine.substring(0, 4));
        int d_mois = Integer.valueOf(chaine.substring(5, 7));
        int d_jour = Integer.valueOf(chaine.substring(8, 10));
        GregorianCalendar date = new GregorianCalendar(d_annee, d_mois, d_jour);

        return date;
    }
}
