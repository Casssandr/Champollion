package champollion;

public class Enseignement {

    private UE myUE;
    private int myHeureCM;
    private int myHeureTD;
    private int myHeureTP;


    public Enseignement (UE ue, int heureCM, int heureTD, int heureTP){
        myUE = ue;
        myHeureCM = heureCM;
        myHeureTD = heureTD;
        myHeureTP = heureTP;
    }

    public UE getUE(){return myUE;}

    public int getHeureCM(){return myHeureCM;}

    public int getHeureTD(){return myHeureTD;}

    public int getHeureTP(){return myHeureTP;}
}
