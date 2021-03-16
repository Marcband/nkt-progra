package tasks.rekursion;

public class SumRek {
    public static void main(String[] args) {
        if(args.length < 1) {
            System.out.println("Zu wenig Argumente");
            return;
        }
        int n = Integer.parseInt(args[0]);
        System.out.println(f(n));
    }

    private static int f(int n) {
        if(n <= 1) return 1;
        else return f(n-1) + n*n;
    }
}
