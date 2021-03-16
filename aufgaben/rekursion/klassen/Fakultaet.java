package video;

public class Fakultaet {
    public static void main(String[] args) {
        if(args.length < 1) {
            System.out.println("Zu wenig Argumente");
            return;
        }

        int n = Integer.parseInt(args[0]);

        System.out.println(fakIt(n));
        System.out.println(fakRek(n));
    }

    private static int fakIt(int n) {
        int res = 1;
        for(int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    private static int fakRek(int n) {
        if(n <= 1) return 1;
        else return fakRek(n - 1) * n;
    }
}
