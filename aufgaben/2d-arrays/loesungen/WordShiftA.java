package tasks.array2d;

public class WordShiftA {
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
    }
}
