package Objektorientierung.Vererbung_Aufgaben;

abstract public class Säugetier extends Lebewesen {
    int trageZeit;
    int saeugeZeit;

    public Säugetier(int lebenserwartung, int trageZeit, int saeugeZeit, String g){
        super(lebenserwartung,g);
        this.trageZeit = trageZeit;
        this.saeugeZeit = saeugeZeit;
    }

    public void gruessen(){
        System.out.print("Das Tier sagt: ");
    }

    public Säugetier(){
        super(60,"");
        this.trageZeit=9;
        this.saeugeZeit=4;
    }
}
