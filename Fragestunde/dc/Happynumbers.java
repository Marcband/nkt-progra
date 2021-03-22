package Fragestunde.dc;

public class Happynumbers {

    static int sumDigitSquare(int n) {
        int sum = 0;
        while (n > 0) {
            sum += (n % 10) * (n % 10);
            n /= 10;
        }
        return sum;
    }

    static boolean isHappy(int n) {
        while (n != 4 && n != 1) {
            n = sumDigitSquare(n);
        }
        return (n == 1);
    }

    static int[] happyNumbers(int k) {
        int[] array = new int[k];
        int cnt = 1;
        int i = 0;
        while (i < array.length) {
            if (isHappy(cnt)) {
                array[i] = cnt;
                i++;
            }
            cnt++;
        }
        return array;
    }

    private static void printHappyNumbers(int[] hn) {
        for (int i = 0; i < hn.length; i++) {
            System.out.print(hn[i] + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println(isHappy(13));
        System.out.println("----------------");
        System.out.println(isHappy(14));
        printHappyNumbers(happyNumbers(10));
    }
}
