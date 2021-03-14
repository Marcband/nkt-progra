package tasks.switchcase;

public class SwitchCaseA {
    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++) {

            switch(args[i]) {
                case "a": System.out.println("Der Buchstabe ist a"); break;
                case "b": System.out.println("Der Buchstabe ist b"); break;
                case "c": System.out.println("Der Buchstabe ist c"); break;
                case "d": System.out.println("Der Buchstabe ist d"); break;
                case "e": System.out.println("Der Buchstabe ist e"); break;
                case "f": System.out.println("Der Buchstabe ist f"); break;
                default: System.out.println("ungültige Eingabe");
            }
        }
    }
}
