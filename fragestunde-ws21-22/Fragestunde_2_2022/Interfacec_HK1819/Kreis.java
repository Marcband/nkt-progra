package Fragestunde_2022.Interfacec_HK1819;

public class Kreis implements GeoObjekt {

    double radius;

    public Kreis(double radius){
        this.radius = radius;
    }

    @Override
    public double flache() {
        return 3.14*radius*radius;
    }

    @Override
    public double umfang() {
        return 2*3.14*radius;
    }
}
