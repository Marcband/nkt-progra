package Fragestunde_2022.Interfacec_HK1819;

public class Test {


    public static void main(String[] args) {
        Kreis kreis = new Kreis(1);
        Rechteck rechteck = new Rechteck(2,2);

        GeoObjekt[] geoObjekts = new GeoObjekt[2];
        geoObjekts[0]=kreis;
        geoObjekts[1]=rechteck;

        System.out.println("Gesamtfläche: " + gesamtFlaeche(geoObjekts));

    }

    public static double gesamtFlaeche(GeoObjekt[] geoObjekts){
        double gesamtF = 0;
        for(int i=0;i<geoObjekts.length;i++){
            gesamtF = gesamtF + geoObjekts[i].flache();
        }

        return gesamtF;

    }
}
