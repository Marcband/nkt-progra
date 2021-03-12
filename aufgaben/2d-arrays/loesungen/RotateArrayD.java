package tasks.array2d;

public class RotateArrayD {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        int[][] arr = new int[x][y];
    }

    private static void fillArray(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                arr[i][j] = (int) (Math.random()*10);
            }
        }
    }
}
