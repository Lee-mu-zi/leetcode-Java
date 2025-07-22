import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        String s = new Solution().removeDuplicates("abbaca");
        System.out.println(s);
    }
}

class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        char[] array = s.toCharArray();
        for (char c : array) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        stack.forEach(sb::append);
        return sb.reverse().toString();
    }
}