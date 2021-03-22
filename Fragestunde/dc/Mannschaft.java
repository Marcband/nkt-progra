package Fragestunde.dc;

public class Mannschaft {
    private String teamName;
    private Trainer trainer;
    private Spieler[] spieler;

    public Mannschaft(String name, Trainer trainer, Spieler[] spieler) {
        if (spieler.length!=11){
            System.err.println("Mannschaft muss genau 11 Spieler haben");
        }
        this.teamName = name;
        this.trainer = trainer;
        this.spieler=spieler;
    }

    public static void main(String[] args) {
        Trainer t = new Trainer("Peter",46,4);
        Spieler[] s = new Spieler[12];
        for (int i = 0; i < s.length; i++) {
            s[i] = new Spieler("Hans",24+i,i);
        }
        Mannschaft m = new Mannschaft("Team Java",t,s);
    }
}
