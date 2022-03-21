package Klausurbesprechung_2022;

public class Happynumber {

    public static void main(String[] args) {
        System.out.println( sumDigitSquare(13) );
        System.out.println( isHappy(13) );
        System.out.println( isHappy(14) );
        printHappyNumbers( happyNumbers(10) );
    }

    private static void printHappyNumbers(int[] hn) {
        for(int i = 0; i < hn.length; i++) {
            System.out.print(hn[i] + " ");
        }
    }


    private static int sumDigitSquare(int n) {
        int sum = 0;
        while(n > 0) {
            sum += (n % 10) * (n % 10);
            n /= 10;
        }
        return sum;
    }

    private static boolean isHappy(int n){
        while (n != 4 && n != 1){
            n = sumDigitSquare(n);
        }
        return (n==1);

    }

    private static int[] happyNumbers(int k){
        int[] arr = new int[k];
        int i = 1;
        for(int j= 0;j < arr.length;j++){
            while(!isHappy(i)){
                i++;
            }
            arr[j]=i;
            i++;
        }
        return arr;
    }


}
