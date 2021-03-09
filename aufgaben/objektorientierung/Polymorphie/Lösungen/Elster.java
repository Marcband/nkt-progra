package Objektorientierung.Vererbung_Aufgaben;

public class Elster extends Voegel {

    private int gestohleneGegenstaende;
    public Elster(int lebenserwartung, String gattungsbezeichnung, int reichweite) {
        super(lebenserwartung, gattungsbezeichnung, reichweite);
        gestohleneGegenstaende=0;
    }

    public void klaueWasGlaenzt(){
    gestohleneGegenstaende++;
}

    @Override
    public void schreien(){
        System.out.println("KrahKrah");
    }

}
