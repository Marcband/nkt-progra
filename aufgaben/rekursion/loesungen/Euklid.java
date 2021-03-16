package tasks.rekursion;

public class Euklid {
    public static void main(String[] args) {
        if(args.length < 2) {
            System.out.println("Zu wenig Argumente");
            return;
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println(ggt(a, b));
    }

    private static int ggt(int a, int b) {
        if(a == b) return a;
        else if(a > b) return ggt(a-b, b);
        else return ggt(a, b-a);
    }
}
