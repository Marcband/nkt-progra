package video;

public class Datentypen {
    public static void main(String[] args) {
        int a = 1;
        long b = 2L;

        double c = 1.3;

        boolean d = false;

        char ch = 'a';
        String str = "8";
        int e = str.length();
        System.out.println(str.charAt(0));

        int strInt = Integer.parseInt(str);
        long strLong = Long.parseLong(str);
        double strDouble = Double.parseDouble(str);

        System.out.println(strInt);

        String zahl = String.valueOf(a);
        zahl = a + "";
        zahl = a + str;
        System.out.println(zahl);

        int f = (int) c;
        System.out.println(f + " " + c);
    }
}
