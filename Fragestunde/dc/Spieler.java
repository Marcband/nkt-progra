package Fragestunde.dc;

public class Spieler extends Mitglied {
    private int geschosseneTore;
    public Spieler(String name, int alter, int geschosseneTore) {
        super(name,alter);
        this.geschosseneTore = geschosseneTore;
    }
    public Spieler(String name, int alter) {
        super(name, alter);
        this.geschosseneTore = 0;
    }

}
