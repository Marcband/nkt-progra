package video;

public class Sum {
    public static void main(String[] args) {

        if(args.length > 2) {
            int amount = args.length;
            int[] arr = new int[amount];

            for(int i = 0; i < amount; i++) {
                arr[i] = Integer.parseInt(args[i]);
            }
            print(sumAll(arr));
        } else if(args.length == 2) {
            int res = sum(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
            System.out.println(res);
        } else {
            System.out.println("Bitte gib mindestens 2 Argumente an.");
        }
    }

    private static int sum(int a, int b) {
        return a + b;
    }

    private static int sumAll(int[] input) {
        int res = 0;
        for (int i = 0; i < input.length; i++) {
            res = sum(res, input[i]);
        }
        return res;
    }

    private static void print(int a) {
        System.out.println(a);
    }
}
