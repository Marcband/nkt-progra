package Klausurbesprechung_2022;

public class SchleifenRekursion {

    public static void main(String[] args) {

//        int a = 21;
//        while (a >= 0) {
//            a = a - 7;
//            System.out.println(a * 3);
//
//        }

//        for (int a = 14; a >= -7; a = a - 7) {
//            System.out.println(a * 3);
//        }


//        int m = 1;
//        for (int n = 110; n >= 0; n -= m * 2) {
//            m *= 5;
//        }

//        int m = 1;
//        int n = 110;
//        do {
//            m *= 5;
//            n -= m * 2;
//        }while(n >= 0);

    }

    public static int calc_1 ( int n) {
        if (n <= 9) {
            return n;
        }
        return calc_1(calc_1(n / 10) + n % 10);
    }

    public static int calc_2 (int n){

        while(n>9){
            int queersumme = 0;
            while(n != 0){
                queersumme += n % 10;
                n = n / 10;
            }
            n = queersumme;
        }
        return n;
    }

    public static int calc_3 (int n){

        while(n>9){
            n = n /10 + n % 10;
        }
        return n;
    }


}
