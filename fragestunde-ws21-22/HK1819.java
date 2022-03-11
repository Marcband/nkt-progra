public class HK1819 {
    public static void main(String[] args) {
        int[] b = new int[1];
        int[] a;
        a = b;
        b[0] = 42;
        a[0] = 21;

        System.out.println(a[0] + " " + b[0]);
    }

    public void forToWhile() {
        int a = 0;
        int i = 7;
        while ( i < 12 )  {
            a += i * 2;
            i += 3;
        }
    }

    public int recToIt(int a, int b) {
        int res = b;
        while ( a <= 0 ) {
            res *= b;
            a -= 2;
            if(a == 1) {
                res += b;
                return res;
            }
        }
        res += 13;
        return res;
    }

    public int[] countNums(int[] nums) {
        int maxValue = 0;
        for(int i : nums) {
            if (i > maxValue) maxValue = i;
        }
        int[] arr = new int[maxValue+1];

        for(int i : nums) {
            arr[i]++;
        }

        return arr;
    }

    public int[] longestSeq(int[] nums) {
        if(nums.length<1) {
            int[] arr = new int[0];
            return arr;
        }

        int longestSeq = 0;
        int longestSeqStart = 0;
        int curSeq = 0;
        int curSeqStart = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[i-1]) {
                curSeq++;
            }
            else {
                if(curSeq > longestSeq) {
                    longestSeq = curSeq;
                    longestSeqStart = curSeqStart;
                    curSeq = 1;
                    curSeqStart = i;
                }
            }
        }
        int[] arr = new int[longestSeq];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = nums[longestSeqStart+i];
        }
        return arr;
    }
}
