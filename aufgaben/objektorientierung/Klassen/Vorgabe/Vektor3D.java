package Objektorientierung;

class Vektor3D {
    //Klassenvariable
    static final int dimensionen = 3;
    // Instanzvariablen
    int x;
    int y;
    int z;
    // Konstruktor
    Vektor3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    //Klassenmethode
    static int getDimension() {
        return dimensionen;
    }
    //Instanzmethode
    int getX(){
        return this.x;
    }
    void setX(int x){
        this.x=x;
    }

    public static void main(String[] args) {
        Vektor3D v1 = new Vektor3D(1,2,3);
        v1.setX(5);
        System.out.println("Vektor v1 hat die Dimension: " + Vektor3D.getDimension() + "\nUnd die Werte:\nx: " + v1.getX() + "\ny: " + v1.y + "\nz: " + v1.z);
    }

}
