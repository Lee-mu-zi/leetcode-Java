import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        int i = new Solution().maxDepth("(1+(2*3)+((8)/4))+1");
        System.out.println(i);
    }
}

class Solution {
    public int maxDepth(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        char[] array = s.toCharArray();
        int max = 0;
        for (char c : array) {
            if(!stack.isEmpty() && c == ')' && stack.peek() == '(') {
                stack.pop();
                continue;
            }
            if(c == '(' || c == ')') {
                stack.push(c);
            }
            max = Math.max(max, stack.size());
        }
        return max;
    }
}