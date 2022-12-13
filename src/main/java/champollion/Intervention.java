package champollion;

import java.util.Date;

public class Intervention {

    private Date myDebut;
    private int myDuree;
    private boolean myAnnulee;
    private int myHeureDebut;

    public Intervention (Date debut, int duree, boolean myAnnulee, int heureDebut){
        myDebut = debut;
        myDuree = duree;
        myAnnulee = false;
        myHeureDebut = heureDebut;
    }

    public Date getDate(){return myDebut;}

    public int getDuree(){return myDuree;}

    public boolean getAnnulee(){return myAnnulee;}

    public int getHeureDebut(){return myHeureDebut;}

}
