package Objektorientierung.Vererbung;

abstract public class Lebewesen {
    private int alter;
    private int lebenserwartung;
    private String gattungsbezeichnung;

    public void altern() {
        alter++;
    }

    public int getAlter(){
        return this.alter;
}

    public String getGattungsbezeichnung() {
        return gattungsbezeichnung;
    }

    public Lebewesen(int lebenserwartung, String gattungsbezeichnung) {
        this.alter = 0;
        this.lebenserwartung = lebenserwartung;
        this.gattungsbezeichnung = gattungsbezeichnung;
    }

}
