package tasks.array2d;

public class WordShiftB {
    public static void main(String[] args) {
        if(args.length < 1) {
            System.out.println("Zu wenig Argumente.");
            return;
        }

        String[][] wordShift = new String[args[0].length()][args[0].length()];
        for(int i = 0; i < wordShift.length; i++) {
            for(int j = 0; j < wordShift.length; j++) {
                int row = i + j;
                if(row >= wordShift.length) row -= wordShift.length;
                wordShift[i][row] = args[0].charAt(j) + " ";
            }
        }

        printArray(wordShift);
    }

    public static void printArray(String[][] wordShift) {
        for(int i = 0; i < wordShift.length; i++) {
            for(int j = 0; j < wordShift.length; j++) {
                System.out.print(wordShift[i][j]);
            }
            System.out.println();
        }
    }
}
