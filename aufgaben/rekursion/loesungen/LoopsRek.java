package tasks.rekursion;

public class LoopsRek {
    public static void main(String[] args) {
        int a = 20;
        int b = 7;
        System.out.println(loopRekC(a, b));
        System.out.println(loopItC(a, b));
        System.out.println();
        System.out.println(loopItD(a));
        System.out.println(loopRekD(a));
    }

    private static int loopRekC(int a, int b) {
        if(a <= 0) {
            return b + 13;
        }
        else if (a == 1) {
            return b;
        }
        else return b * loopRekC(a - 2, b);
    }

    private static int loopItC(int a, int b) {
        int res = 1;
        for(int i = a; i >= 0; i -= 2) {
            if(i == 0) res *= b + 13;
            else res *= b;
        }
        return res;
    }

    private static int loopItD(int a) {
        int res = 0;
        for(int i = a; i >= 1; i -= 4) {
            res += i * i - 1;
        }
        return res;
    }

    private static int loopRekD(int a) {
        if(a <= 0) {
            return a ;
        }
        else return a * a - 1 + loopRekD(a - 4);
    }
}
