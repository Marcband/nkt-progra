package tasks;

public class SumB {
    public static void main(String[] args) {

        if(args.length > 2) {
            int amount = args.length;
            double[] arr = new double[amount];

            for(int i = 0; i < amount; i++) {
                arr[i] = Double.parseDouble(args[i]);
            }
            print(sumAll(arr));
            print(product(arr));
        } else if(args.length == 2) {
            double res = sum(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
            System.out.println(res);
        } else {
            System.out.println("Bitte gib mindestens 2 Argumente an.");
        }
    }

    private static double sum(double a, double b) {
        return a + b;
    }

    private static double sumAll(double[] input) {
        double res = 0;
        for (int i = 0; i < input.length; i++) {
            res = sum(res, input[i]);
        }
        return res;
    }

    private static double product(double[] input) {
        double res = 1;
        for (int i = 0; i < input.length; i++) {
            res *= input[i];    // res = res * input[i]
        }
        return res;
    }

    private static void print(double a) {
        System.out.println(a);
    }
}
