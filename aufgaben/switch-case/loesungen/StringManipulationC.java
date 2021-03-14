package tasks.switchcase;

public class StringManipulationC {
    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("Ungültige Anzahl an Argumenten");
            return;
        }

        System.out.println(args[0]);
        String output = "";
        for(int i = 0; i < args[0].length(); i++) {
            switch (args[0].charAt(i)) {
                case 'a': output += "u"; break;
                case 'e': output += "o"; break;
                case 's': output += "d"; break;
                case 'u': output += "a"; break;
                case 'o': output += "e"; break;
                case 'd': output += "s"; break;
                default: output += args[0].charAt(i);
            }
        }
        System.out.println(output);
    }
}
