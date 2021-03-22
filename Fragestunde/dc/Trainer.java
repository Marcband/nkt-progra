package Fragestunde.dc;

public class Trainer extends Mitglied {
    int erfahrungInJahren;


    public Trainer(String name, int alter,int erfahrungInJahren) {
        super(name, alter);
        this.erfahrungInJahren = erfahrungInJahren;
    }
}
