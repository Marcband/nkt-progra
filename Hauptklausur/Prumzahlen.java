package Hauptklausur;

public class Prumzahlen {

    // Aufgabe 3 a)
    static boolean isPrum(int x){
        if(x % 3 == 0 || x % 5 == 0 || x % 7 == 0){
            return true;
        }
        return false;
    }
    // Aufgabe 3 b)
    static int[] prumArray(int n){
        int[] array = new int[n];
        int index = 0;
        int counter = 2; // Die Erste Prumzahl ist 3
        while(index<n){
            counter++;
            if(isPrum(counter)){
                array[index] = counter;
                index++;
            }
        }
        return array;
    }
    // Aufgabe 3 c)
    static int prumSum(int n){
        int[] array = prumArray(n);
        int sum = 0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(prumSum(n));
    }

}
