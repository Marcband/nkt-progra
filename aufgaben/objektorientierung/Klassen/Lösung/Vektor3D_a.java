package Objektorientierung.Klassen;

import java.util.Scanner;

class Vektor3D_a {
    //Klassenvariable
    static final int dimensionen = 3;
    static final int max_x_value = 200;
    // Instanzvariablen
    int x;
    int y;
    int z;
    // Konstruktor
    Vektor3D_a(int x, int y, int z) {
        if(x<=200) {
            this.x = x;
        } else {
            this.x = max_x_value;
        }
        this.y = y;
        this.z = z;
    }

    Vektor3D_a(){
        this.x=0;
        this.y=0;
        this.z=0;
    }

    //Klassenmethode
    static int getDimension() {
        return dimensionen;
    }

    static Vektor3D_a add(Vektor3D_a a, Vektor3D_a b){
        Vektor3D_a c = new Vektor3D_a();
        c.add(a);
        c.add(b);
        return c;
    }
    //Instanzmethode
    void add(Vektor3D_a a){
        this.x+=a.x;
        this.y+=a.y;
        this.z+=a.z;
    }
    void addAll(){
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int[] values = new int[3];
        while(scanner.hasNextInt()){
            values[counter-1]=scanner.nextInt();
            if (counter%3 == 0){
                Vektor3D_a v = new Vektor3D_a(values[0],values[1],values[2]);
                this.add(v);
                counter = 0;
            }
            counter++;
        }
    }

    void printVektor(){
        System.out.println("x: " + this.x + " y: " + this.y + " z: " + this.z);
    }



    public static void main(String[] args) {
        //Bonus (4)
        Vektor3D_a v1 = new Vektor3D_a();
        v1.addAll();
        v1.printVektor();

        //Bonus -> (3)
        /*Vektor3D_a[] vectoren = new Vektor3D_a[5];
        vectoren[0] = new Vektor3D_a(
                Integer.parseInt(args[0])
                ,Integer.parseInt(args[1])
                ,Integer.parseInt(args[2])
        );
        vectoren[1] = new Vektor3D_a(
                Integer.parseInt(args[3])
                ,Integer.parseInt(args[4])
                ,Integer.parseInt(args[5])
        );
        vectoren[2] = Vektor3D_a.add(vectoren[0],vectoren[1]);

        vectoren[3] = new Vektor3D_a(
                Integer.parseInt(args[0])
                ,Integer.parseInt(args[1])
                ,Integer.parseInt(args[2])
        );
        vectoren[4] = new Vektor3D_a(
                Integer.parseInt(args[3])
                ,Integer.parseInt(args[4])
                ,Integer.parseInt(args[5])
        );

        vectoren[3].add(vectoren[4]);
        for(int i=0;i<vectoren.length;i++){
            System.out.println("Der Vektor " + (i+1 + " hat folgende Werte:"));
            vectoren[i].printVektor();
        }*/

    }

}
