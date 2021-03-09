package tasks;

public class LoopsH {
    public static void main(String[] args) {
        loopHWhile();
        System.out.println();
        loopHFor();
    }

    public static void loopHWhile() {
        int counter = 0;
        while(counter < 10) {
            int number = 10 - counter;
            System.out.print(number);
            counter += 3;
        }
    }

    public static void loopHFor() {
        for(int counter = 0; counter < 10; counter += 3) {
            int number = 10 - counter;
            System.out.print(number);
        }
    }
}
