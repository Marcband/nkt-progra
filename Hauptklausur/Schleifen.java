package Hauptklausur;

public class Schleifen {


    // Aufgabenteil c und d :
    // c -> Die Methode berechnet ein einstellige/iterierte Quersumme.
    public static int calc(int n){
        System.out.println(n);
        if(n<10){
            return n;
        }
        return calc(calc(n/10) + n%10);
    }


    public static int calcIt(int n){
        while(n>=10){
            System.out.println(n);
            n = n/10 + n%10;
        }
        System.out.println(n);
        return n;
    }



    public static void main(String[] args) {

        calc(4536);
        calcIt(6354);
        // Zum testen einfach entsprechenden Codeabschnitt auskommentieren.
        //Aufgabenteil a)
        //Ursprungscode:
        /*
        int x=1;
        int y=72;
        do {
            x*=6;
            System.out.println(y);
            y -= x*2;
        } while(y>=42);
        /*
        // umgewandelt in eine for Schleife:
        /*
        int x = 1;
        for(int y = 72;y>=42;y-=x*2){
            x*=6;
            System.out.println(y);

        }*/
        // Aufgabenteil b)
        /*
        int a = 5;
        for(int b = 220;b>=0; b-=a*2){
            b*=5;
            //System.out.println(b);
        }
        */
        // Umgewandelt in eine while-Schleife:
        /*
        int a = 5;
        int b = 220;
        while(b>=0){
            b*=5;
            //System.out.println(b);
            b-= a*2;
        }
         */

    }
}
