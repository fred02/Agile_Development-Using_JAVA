package soumission;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class Soumission<T extends ArrayList> {
        
        private Voiture voitures[];
        private Moto motos[];
        private Conducteur conducteur;
        private int duree_contrat; 
        private boolean assurable;

    public Soumission(JSONObject json)throws FileNotFoundException, IOException{
        
        JSONArray voituresJSON = json.getJSONArray("voitures");
        JSONArray motosJSON = json.getJSONArray("motos");
        JSONObject conducteurJSON = json.getJSONObject("conducteur");
        
        assurable=true;
        
        voitures=new Voiture[voituresJSON.size()];
        for (int i = 0; i < voituresJSON.size() ; ++i) { 
            int annee=(voituresJSON.getJSONObject(i)).getInt("annee");
            String marque=(voituresJSON.getJSONObject(i)).getString("marque");
            String modele=(voituresJSON.getJSONObject(i)).getString("modele");
            int indice;
            int valeur_Init=0;
            if((indice = Voiture.trouverVehicule(annee,marque,modele))>=0)
            {
                valeur_Init = Voiture.valeurVehicule(indice);
            }
            else
            {
                assurable=false;
            }
            
            voitures[i] = new Voiture(voituresJSON.getJSONObject(i),valeur_Init);
        }
        
        motos=new Moto[motosJSON.size()];
        for (int j = 0; j < motosJSON.size() ; ++j) { 
            int annee=(motosJSON.getJSONObject(j)).getInt("annee");
            String marque=(motosJSON.getJSONObject(j)).getString("marque");
            String modele=(motosJSON.getJSONObject(j)).getString("modele");
            int indice;
            int valeur_Init=0;
            double cc=0;
            
            if((indice = Moto.trouverVehicule(annee,marque,modele))>=0)
            {
                valeur_Init = Moto.valeurVehicule(indice);
                cc = Moto.ccMoto(indice);
            }
            else
            {
                assurable=false;
            }
            motos[j] = new Moto(motosJSON.getJSONObject(j),valeur_Init,cc);
        }
        
        conducteur = new Conducteur(conducteurJSON);
            
        duree_contrat=json.getInt("duree_contrat");
        
        assurable = assurable && Conducteur.assurable(conducteur);
    }
    
    public Soumission(Soumission<ArrayList> soumission){
        
        voitures=soumission.getVoitures();
        
        motos=soumission.getMotos();
        
        conducteur=soumission.getConducteur();
        
        duree_contrat=soumission.getDuree_contrat(); 
        
        assurable=soumission.getAssurable();
    }

    public Voiture getVoiture(int pos) {
        return voitures[pos];
    }
    
    public Voiture[] getVoitures() {
        return voitures;
    }
    
    public int getNbVoitures() {
        return voitures.length;
    }
    
    public Moto getMoto(int pos) {
        return motos[pos];
    }
    
    public Moto[] getMotos() {
        return motos;
    }
    
    public int getNbMotos() {
        return motos.length;
    }
    
    public Conducteur getConducteur() {
        return conducteur;
    }
    
    public int getDuree_contrat() {
        return duree_contrat;
    }

    public boolean getAssurable(){
        return assurable;
    }
    
    
}
