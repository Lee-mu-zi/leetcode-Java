import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "(]";
        boolean valid = solution.isValid(s);
        System.out.println(valid);
    }
}

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' ||s.charAt(i) == '{' ||s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            }
            if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
                if(stack.empty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return true;
    }
}