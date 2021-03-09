package tasks;

public class SearchE {
    public static void main(String[] args) {
        System.out.println("shortest: " + getShortestString(args));
        System.out.println("longest:  " + getLongestString(args));

    }

    public static String getShortestString(String[] input) {
        if(input.length == 0) return null;
        String shortest = input[0];
        for(int i = 1; i < input.length; i++) {
            if(input[i].length() < shortest.length()) shortest = input[i];
        }
        return shortest;
    }

    public static String getLongestString(String[] input) {
        if(input.length == 0) return null;
        String longest = input[0];
        for(int i = 1; i < input.length; i++) {
            if(input[i].length() > longest.length()) longest = input[i];
        }
        return longest;
    }

    public static boolean hasString(String[] input, String str, int start) {
        for(int i = start; i < input.length; i++) {
            if(str.equals(input[i])) return true;
        }
        return false;
    }
}
