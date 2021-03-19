package Hauptklausur;

import java.util.Stack;

public class StackOfStrings {
    Stack<String> stack;

    public StackOfStrings() {
        this.stack = new Stack<String>();
    }

    boolean isEmpty(){
        return stack.isEmpty();
    }

    void push(String item){
        stack.push(item);
    }

    String pop(){
        return stack.pop();
    }
}
