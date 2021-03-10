package video;

public class SwitchCase {
    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++) {

            switch(args[i]) {
                case "a": System.out.println("Der Buchstabe ist a"); break;
                case "b": System.out.println("Der Buchstabe ist b"); break;
                case "c": System.out.println("Der Buchstabe ist c"); break;
                default: System.out.println("ungültige Eingabe");
            }
        }
    }
}
