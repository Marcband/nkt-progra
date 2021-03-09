package Objektorientierung.Vererbung_Aufgaben;

public class Zoo {
    private Lebewesen[][] lebewesen;

    public Zoo(){
        lebewesen = new Lebewesen[3][];
        Fisch[] fische = new Fisch[10];
        Säugetier[] säugetiere = new Säugetier[10];
        Voegel[] voegel = new Voegel[10];
        for(int i=0;i<10;i++){
            if(i<5){
                    fische[i] = new Hecht();
                    säugetiere[i] = new Katze();
                    voegel[i] = new Kraehe(28,"kraehe",80);
                } else {
                    fische[i] = new Hecht();
                    säugetiere[i] = new Hund(3);
                    voegel[i] = new Elster(26,"elster",30);
            }
            lebewesen[0]=fische;
            lebewesen[1]=säugetiere;
            lebewesen[2]=voegel;
        }
    }

    public void einJahrVergeht() {
        for (int i = 0; i < lebewesen.length; i++) {
            for (int j = 0; j < lebewesen[i].length; j++) {
                if (lebewesen[i] != null) {
                    lebewesen[i][j].altern();
                    System.out.println("Unser/e " + lebewesen[i][j].getGattungsbezeichnung() + " ist " + lebewesen[i][j].getAlter() + " Jahre alt.");
                }
            }
        }
    }


    public static void main(String[] args) {
        Zoo z = new Zoo();
        z.einJahrVergeht();
        z.einJahrVergeht();
        for(int i=0;i<z.lebewesen[2].length;i++){
            ((Voegel)z.lebewesen[2][i]).schreien();
        }
        Voegel v = (Voegel) z.lebewesen[2][3];
        for (int i = 0; i < 20; i++) {
            v.fliegen();
        }
    }
}
