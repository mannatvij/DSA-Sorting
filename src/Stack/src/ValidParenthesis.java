import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParenthesis {
    static boolean matching(char a, char b) {
        return (
                (a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']')
        );
    }
        boolean isValid(String str){
            Deque<Character> stack = new ArrayDeque<Character>();

            for(int i = 0; i < str.length(); i++){
                char x = str.charAt(i);
                if(x== '(' || x == '{' || x == '['){
                    stack.push(x);
                }
                else{
                    if(stack.isEmpty() == true){
                        return false;
                    }
                    else if(matching(stack.peek(), x)== false){
                        return false;
                    }
                    else{
                        stack.pop();
                    }
                }
            }
            return stack.isEmpty();
        }
    public static void main(String[] args) {
        ValidParenthesis sol = new ValidParenthesis();

        String test1 = "({[]})";
        String test2 = "([)]";
        String test3 = "(";
        String test4 = "[]{}()";

        System.out.println(test1 + " " + sol.isValid(test1)); // true
        System.out.println(test2 + "  " + sol.isValid(test2)); // false
        System.out.println(test3 + "  " + sol.isValid(test3)); // false
        System.out.println(test4 + "  " + sol.isValid(test4)); // true
    }
}
