package Objektorientierung.Vererbung;

public class Zoo {
    private Lebewesen[] lebewesen;

    public Zoo(){
        lebewesen = new Lebewesen[10];
    }

    public void einJahrVergeht(){
        for(int i=0;i<lebewesen.length;i++){
            if(lebewesen[i]!=null) {
                lebewesen[i].altern();
                System.out.println("Tier " + i + " ist " + lebewesen[i].getAlter() + " Jahre alt.");
            }
        }
    }


    public static void main(String[] args) {
        Zoo z = new Zoo();
        z.lebewesen[0] = new Hecht(60,false,40,3.2);
        z.lebewesen[1] = new Katze(80,16,12,10);
        for(int i=2;i<z.lebewesen.length;i++){
            if(i%2 ==0){
                z.lebewesen[i] = new Hecht();
            } else {
                z.lebewesen[i] = new Katze();
            }
        }
        z.einJahrVergeht();
        z.einJahrVergeht();
        z.einJahrVergeht();
        for(int i=0;i<z.lebewesen.length;i++){
            if(z.lebewesen[i].getClass().getSuperclass() == Säugetier.class)
                ((Säugetier)z.lebewesen[i]).gruessen();
        }
    }
}
