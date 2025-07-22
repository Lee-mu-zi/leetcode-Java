import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        String s = new Solution().removeOuterParentheses("(()())(())(()(()))");
        System.out.println(s);
    }
}

class Solution {
    public String removeOuterParentheses(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        char[] arr = s.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (char c : arr) {
            if (!stack.isEmpty() && stack.peek() == c) {

            }
            stack.push(c);
        }
        stack.forEach(builder::append);
        return builder.reverse().toString();
    }
}