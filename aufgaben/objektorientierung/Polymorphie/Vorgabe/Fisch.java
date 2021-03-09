package Objektorientierung.Vererbung;

abstract public class Fisch extends Lebewesen {
    private int schuppenanzahl;
    private boolean bedrohteart;

    public Fisch(int schuppenanzahl, boolean bedrohteart, int lebensewartung,String g) {
        super(lebensewartung,g);
        this.schuppenanzahl = schuppenanzahl;
        this.bedrohteart = bedrohteart;
    }

}
