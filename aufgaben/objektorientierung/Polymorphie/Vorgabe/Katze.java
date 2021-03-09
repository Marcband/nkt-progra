package Objektorientierung.Vererbung;

public class Katze extends Säugetier {
    int cutenessfactor;

    public Katze(int lebenserwartung, int trageZeit, int saeugeZeit, int cuteness) {
        super(lebenserwartung, trageZeit, saeugeZeit,"katze");
        this.cutenessfactor = cuteness;
    }

    public Katze() {
        super(80, 16, 12,"katze");
        this.cutenessfactor = 20;
    }

    public void gruessen() {
        super.gruessen();
        System.out.println("meow");
    }

    @Override
    public int getAlter() {
        int alter = super.getAlter();
        if (alter <= 2) {
            return alter * 12;
        }
        return 24 + (alter - 2) * 6;
    }

}
