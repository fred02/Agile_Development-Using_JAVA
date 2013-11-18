package soumission;

import java.util.GregorianCalendar;
import java.util.Calendar;
import net.sf.json.JSONObject;

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

public class Conducteur {

    private String date_de_naissance;
    private String province;
    private String ville;
    private char sexe;
    private String date_fin_cours_de_conduite;
    private boolean cours_de_conduite_reconnus_par_CAA;
    private boolean premier_contrat;
    private boolean membre_oiq;

    public Conducteur() {
        this("", "", "", ' ', "", false, false, false);
    }

    public Conducteur(String date_de_naissance_1, String province_1, String ville_1, char sexe_1,
            String date_fin_cours_de_conduite_1, boolean cours_de_conduite_reconnus_par_CAA_1,
            boolean premier_contrat_1, boolean membre_ordreIq) {
        date_de_naissance = date_de_naissance_1;
        province = province_1;
        ville = ville_1;
        sexe = sexe_1;
        date_fin_cours_de_conduite = date_fin_cours_de_conduite_1;
        cours_de_conduite_reconnus_par_CAA = cours_de_conduite_reconnus_par_CAA_1;
        premier_contrat = premier_contrat_1;
        membre_oiq = membre_ordreIq;
    }

    public Conducteur(JSONObject json) {
        date_de_naissance = json.getString("date_de_naissance");
        province = json.getString("province");
        ville = json.getString("ville");
        sexe = json.getString("sexe").charAt(0);
        date_fin_cours_de_conduite = json.getString("date_fin_cours_de_conduite");
        cours_de_conduite_reconnus_par_CAA = json.getBoolean("cours_de_conduite_reconnus_par_CAA");
        premier_contrat = json.getBoolean("premier_contrat");
        membre_oiq = json.getBoolean("membre_oiq");
    }

    public String getDate_de_naissance() {
        return date_de_naissance;
    }

    public boolean isMembre_oiq() {
        return membre_oiq;
    }

    public int get_Age() {

        Calendar client = DateParsing.stringToCalendar(date_de_naissance);
        Calendar maintenant = new GregorianCalendar();

        int ageClient = maintenant.get(Calendar.YEAR) - client.get(Calendar.YEAR);
        if ((client.get(Calendar.MONTH) > maintenant.get(Calendar.MONTH))
                || (client.get(Calendar.MONTH) == maintenant.get(Calendar.MONTH)
                && client.get(Calendar.DAY_OF_MONTH) > maintenant.get(Calendar.DAY_OF_MONTH))) {
            ageClient--;
        }

        return ageClient;
    }

    public String get_Province() {
        return province;
    }

    public String get_Ville() {
        return ville;
    }

    public char get_Sexe() {
        return sexe;
    }

    public String getDate_fin_cours_de_conduite() {
        return date_fin_cours_de_conduite;
    }

    public int get_Experience() {

        Calendar client = DateParsing.stringToCalendar(date_fin_cours_de_conduite);
        Calendar maintenant = new GregorianCalendar();

        int ageClient = maintenant.get(Calendar.YEAR) - client.get(Calendar.YEAR);
        if ((client.get(Calendar.MONTH) > maintenant.get(Calendar.MONTH))
                || (client.get(Calendar.MONTH) == maintenant.get(Calendar.MONTH)
                && client.get(Calendar.DAY_OF_MONTH) > maintenant.get(Calendar.DAY_OF_MONTH))) {
            ageClient--;
        }

        return ageClient;
    }

    public boolean isCours_de_conduite_reconnus_par_CAA() {
        return cours_de_conduite_reconnus_par_CAA;
    }

    public boolean isPremier_contrat() {
        return premier_contrat;
    }

    public static boolean assurable(Conducteur conducteur) {
        int age_client = conducteur.get_Age();
        String province_client = conducteur.get_Province();

        if (!province_client.equalsIgnoreCase("Québec")) {
            return false;
        }

        if (conducteur.get_Sexe() == 'M' || conducteur.get_Sexe() == 'm') {
            if (age_client < 25 || age_client > 75) {
                return false;
            }
        }
        if (conducteur.get_Sexe() == 'F' || conducteur.get_Sexe() == 'f') {
            if (age_client < 21 || age_client > 75) {
                return false;
            }
        }
        return true;
    }
}
