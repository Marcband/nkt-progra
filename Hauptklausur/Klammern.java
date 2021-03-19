package Hauptklausur;

public class Klammern {

    static boolean isValidParenthesisString(String s) {
        StackOfStrings stack = new StackOfStrings();
        for (int i = 0; i < s.length(); i++) {
            System.out.println(stack.stack.toString());
            if (s.charAt(i) == '(') {
                stack.push("(");
            } else if (s.charAt(i) == ')') {
                if (stack.isEmpty()) return false;
                stack.pop();
            }

        }
        if (stack.isEmpty()) return true; // man kann auch nur "return stack.isEmpty()" schreiben
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isValidParenthesisString("(((()))()"));
    }


}
