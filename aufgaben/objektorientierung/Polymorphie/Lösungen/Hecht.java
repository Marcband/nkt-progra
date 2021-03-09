package Objektorientierung.Vererbung_Aufgaben;

public class Hecht extends Fisch {

    double wertProKg;

    public Hecht(int schuppenanzahl, boolean bedrohteart, int lebensewartung,double wertProKg){
        super(schuppenanzahl, bedrohteart, lebensewartung,"hecht");
        this.wertProKg = wertProKg;
    }
    public Hecht(){
        super(50,false,60,"hecht");
        this.wertProKg=2.2;
    }

}
