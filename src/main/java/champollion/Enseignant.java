package champollion;

import java.util.HashSet;
import java.util.Set;

public class Enseignant extends Personne {

    // TODO : rajouter les autres méthodes présentes dans le diagramme UML
    private HashSet<Enseignement> myEnseignements;

    public Enseignant(String nom, String email) {
        super(nom, email);
    }

    /**
     * Calcule le nombre total d'heures prévues pour cet enseignant en "heures équivalent TD" Pour le calcul : 1 heure
     * de cours magistral vaut 1,5 h "équivalent TD" 1 heure de TD vaut 1h "équivalent TD" 1 heure de TP vaut 0,75h
     * "équivalent TD"
     *
     * @return le nombre total d'heures "équivalent TD" prévues pour cet enseignant, arrondi à l'entier le plus proche
     *
     */
    public int heuresPrevues() {
        // TODO: Implémenter cette méthode
        //throw new UnsupportedOperationException("Pas encore implémenté");
        int cm = 0;
        int td = 0;
        int tp = 0;
        for (Enseignement ens : myEnseignements){
            cm = cm + ens.getHeureCM();
            td = td + ens.getHeureTD();
            tp = tp +ens.getHeureTP();
        }
        double equiTD = 1.5*cm + td + 0.75*tp;
        int eqTD = (int) equiTD;
        return eqTD;
    }

    /**
     * Calcule le nombre total d'heures prévues pour cet enseignant dans l'UE spécifiée en "heures équivalent TD" Pour
     * le calcul : 1 heure de cours magistral vaut 1,5 h "équivalent TD" 1 heure de TD vaut 1h "équivalent TD" 1 heure
     * de TP vaut 0,75h "équivalent TD"
     *
     * @param ue l'UE concernée
     * @return le nombre total d'heures "équivalent TD" prévues pour cet enseignant, arrondi à l'entier le plus proche
     *
     */
    public int heuresPrevuesPourUE(UE ue) {
        // TODO: Implémenter cette méthode
        //throw new UnsupportedOperationException("Pas encore implémenté");
        int eqTD = 0;
        for (Enseignement ens : myEnseignements){
            if (ens.getUE() == ue){
                double equiTD = 0.5*ens.getHeureCM()+ ens.getHeureTD() + 0.75*ens.getHeureTP();
                eqTD = (int) equiTD;
            }
        }
        return eqTD;
    }

    /**
     * Ajoute un enseignement au service prévu pour cet enseignant
     *
     * @param ue l'UE concernée
     * @param volumeCM le volume d'heures de cours magitral
     * @param volumeTD le volume d'heures de TD
     * @param volumeTP le volume d'heures de TP
     */
    public void ajouteEnseignement(UE ue, int volumeCM, int volumeTD, int volumeTP) {
        // TODO: Implémenter cette méthode
        //throw new UnsupportedOperationException("Pas encore implémenté");
        Enseignement ens = new Enseignement (ue, volumeCM, volumeTD, volumeTP);
        myEnseignements.add(ens);
    }

    public boolean enSousService(){
        if (this.heuresPrevues() < 192){return true;}
        else{return false;}
    }

}
