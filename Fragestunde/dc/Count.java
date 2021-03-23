package bbb.hk1819_3;

public class Count {
    private int getMax(int[] arr) {
        int max = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }

    public int[] countNums(int[] arr) {
        int[] temp = new int[getMax(arr)+1];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] >= 0) temp[arr[i]]++;
        }
        return temp;
    }

    public int[] longestSeq(int[] arr) {
        int start = 0;
        int length = 0;
        int maxStart = 0;
        int maxLength = 0;
        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i+1] > arr[i]) length++;
            if(arr[i+1] <= arr[i]) {
                if(length > maxLength) {
                    maxLength = length;
                    maxStart = start;
                }
                start = i+1;
            }
        }
        int[] longestSeq = new int[maxLength];
        for(int i = 0; i < maxLength; i++) {
            longestSeq[i] = arr[maxStart+i];
        }
        return  longestSeq;
    }
}
