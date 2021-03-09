package Objektorientierung.Sichtbarkeiten.Datenbank;
import Objektorientierung.Sichtbarkeiten.Objekte.Mensch;

public class Datenbank {
    private Mensch[] menschen;
    private int size;
    private int fill_level;

    public Datenbank(int size){
        size = Math.max(10,size);
        menschen = new Mensch[size];
        this.size=size;
        this.fill_level=0;
    }

    public void addEntry(Mensch mensch){
        if(fill_level<=size){
            menschen[fill_level]=mensch;
        }
    }
    public Mensch getEntry(int index){
        return menschen[index];
    }

    public static void main(String[] args) {
        Datenbank db = new Datenbank(20);
        db.addEntry(new Mensch(46,"Marie","Müller",67));
        Mensch m = db.getEntry(0);
        System.out.println(m.getGewitch());
    }
}
