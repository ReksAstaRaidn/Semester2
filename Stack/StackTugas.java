package JavaSem2.Stack;

import java.util.Stack;

public class StackTugas {

    public static void main(String[] args) {
        String uji1 = "(oasdn = aoisoaf)";
        String uji2 = "({]})";
        

        System.out.println(isBalanced(uji1));
        System.out.println(isBalanced(uji2));
        
    }

    public static boolean isBalanced(String teks) { 
        
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < teks.length(); i++) {
            char c = teks.charAt(i);
            
            if(c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } 
            else if(c == ')' || c == ']' || c == '}') {
                if(stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
