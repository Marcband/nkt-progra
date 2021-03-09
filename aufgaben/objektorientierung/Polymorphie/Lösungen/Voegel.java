package Objektorientierung.Vererbung_Aufgaben;

public class Voegel extends Lebewesen {

    private int reichweite;
    private int schonAmFliegen;

    public Voegel(int lebenserwartung, String gattungsbezeichnung,int reichweite) {
        super(lebenserwartung, gattungsbezeichnung);
        this.reichweite = reichweite;
        this.schonAmFliegen=0;
    }

    public void fliegen(){
        if(reichweite>schonAmFliegen){
            schonAmFliegen+=10;
            System.out.println("Ich fliege schon" + schonAmFliegen + "km!");
        } else {
            System.out.println("Ich muss erstmal Landen!");
            System.out.println("Der Vogel macht eine Pause!");
            schonAmFliegen=0;
        }
    }

    public void schreien(){
        System.out.println("Zwitscher!");
    }

}
