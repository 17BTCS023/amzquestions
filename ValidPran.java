package amzquestions;

import java.util.Stack;

public class ValidPran {

    // isValid(Stack<Character>)

    public static boolean sol1(String s){
        Stack<Character> stack = new Stack<>();
        Character currentTop = '0';
        for(char c : s.toCharArray()){
            if(!stack.isEmpty())
            currentTop = stack.pop();
            switch(c){
                case ']': if(stack.isEmpty() || currentTop== '[') return false;
                case ')': if(stack.isEmpty() || currentTop== '(') return false;
                case '}': if(stack.isEmpty() || currentTop== '{') return false;
                default: stack.push(c);       
            }
        }
        
        return stack.isEmpty();
    }

    public static boolean isValid(String s) {

        if(s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();
       
        for(char c : s.toCharArray()){
            if(c == '(' || c == '[' || c== '{'){
                stack.push(c);
            }
            else if(c== ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }else if(c == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }else if(c == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }
            else if( c == ')' || c == ']' || c== '}' ){
                return false;
            }
        }
        
        return stack.isEmpty();
}

    public static void main(String[] args) {
        // String s = "()[]{}";
        // Stack<Character> stacky = new Stack<>();
        // for(int i = 0; i < s.length(); i++){
        //     stacky.push(s.charAt(i));
        // }
        // System.out.println(stacky);
        // System.out.println(stacky.size());
        // System.out.println('{' - '0'); // 75
        // System.out.println('}' - '0'); // 77
        // System.out.println('[' - '0');// 43
        // System.out.println(']' - '0');// 45
        // System.out.println('(' - '0');// -8
        // System.out.println(')' - '0');// -7
        boolean val = isValid("([}}])");
        System.out.println( val);

        
    }
}
