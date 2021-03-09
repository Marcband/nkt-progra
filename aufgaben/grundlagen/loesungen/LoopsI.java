package tasks;

public class LoopsI {
    public static void main(String[] args) {
        loopIFor();
        System.out.println();
        loopIWhile();
    }

    public static void loopIFor() {
        for(int i = 13; i != 0; i = i - 1) {
            if(i % 2 == 0) System.out.println(i + "gerade");
            else System.out.println(i + "ungerade");
        }
    }

    public static void loopIWhile() {
        int i = 13;
        while (i != 0) {
            if(i % 2 == 0) System.out.println(i + "gerade");
            else System.out.println(i + "ungerade");
            i = i - 1;
        }
    }
}
