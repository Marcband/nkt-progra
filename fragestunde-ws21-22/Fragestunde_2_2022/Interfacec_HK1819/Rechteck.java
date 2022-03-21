package Fragestunde_2022.Interfacec_HK1819;

public class Rechteck implements GeoObjekt {

    private double a;
    private double b;

    public Rechteck(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double flache() {
        return a*b;
    }

    public double umfang() {
        return (2*a)+(2*b);
    }
}
