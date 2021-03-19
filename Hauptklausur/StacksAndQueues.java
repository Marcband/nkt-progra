package Hauptklausur;


import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class StacksAndQueues {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        String s = "ABCDEFG";
        for(int i=0;i<s.length();i++){
            stack.push(String.valueOf(s.charAt(i)));
            System.out.println(stack.toString());
            if(i%2 == 1){
                stack.pop();
                System.out.println(stack.toString());
            }
        }
    }
}
