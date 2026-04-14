package JavaSem2.Stack;

import java.util.Stack;

public class ContohStack {
    
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Hello");

        stack.push("World");

        stack.push("Java");

        stack.push("nabil");
        
        System.out.println("Method Peek: " + stack.peek());

        System.out.println("Sebelum DiPop: " + stack);
        stack.pop();
        System.out.println("Sesudah DiPop: " + stack);
        stack.pop();
        System.out.println("Sesudah DiPop: " + stack);
    }


}
