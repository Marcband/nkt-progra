package Objektorientierung.Vererbung_Aufgaben;

public class Hund extends Säugetier {

    private int felldichte;

    public Hund(int felldichte){
        super(20,16,12,"hund");
        this.felldichte = felldichte;
    }

    @Override
    public void gruessen() {
        super.gruessen();
        System.out.println("Wuff");
    }

    @Override
    public void altern() {
        super.altern();
        felldichte++;
    }

    public void schneideFell(){
        felldichte = felldichte-3;
        if(felldichte<0){
            felldichte=0;
        }
        System.out.println("Der Hund war beim Friseur");
    }

}
