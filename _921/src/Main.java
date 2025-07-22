import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        String s = "()))((";
        int i = new Solution().minAddToMakeValid(s);
        System.out.println(i);
    }
}

class Solution {
    public int minAddToMakeValid(String s) {
        char[] charArray = s.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : charArray) {
            if (!stack.isEmpty() && stack.peek() != c && stack.peek() != ')') {
                stack.pop();
                continue;
            }
            stack.push(c);
        }
        return stack.size();
    }
}