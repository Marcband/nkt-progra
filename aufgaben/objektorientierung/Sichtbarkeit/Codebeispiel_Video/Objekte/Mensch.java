package Objektorientierung.Sichtbarkeiten.Objekte;

public class Mensch {

    private int alter;
    private String name;
    private String vorname;
    private int gewicht;

    public Mensch(int alter, String vorname,String name, int gewicht){
        this.alter = alter;
        this.vorname = vorname;
        this.name = name;
        this.gewicht = gewicht;
    }

    private void changeGewicht(int delta){
        this.gewicht += delta;
    }

    public void macheSport(){
        this.changeGewicht(-1);
    }

    public void issGanzViel(){
        this.changeGewicht(2);
    }

    public int getGewitch(){
        return this.gewicht;
    }

}