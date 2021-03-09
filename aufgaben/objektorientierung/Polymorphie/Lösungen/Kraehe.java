package Objektorientierung.Vererbung_Aufgaben;

public class Kraehe extends Voegel {

    private int iq;

    public Kraehe(int lebenserwartung, String gattungsbezeichnung, int reichweite) {
        super(lebenserwartung, gattungsbezeichnung, reichweite);
        this.iq = 100;
    }

    @Override
    public void schreien() {
        System.out.println("Krächz!");
    }
}
