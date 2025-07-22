import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        String s = "cdbcbbaaabab";
        int x = 4, y = 5;
        int i = new Solution().maximumGain(s, x, y);
        System.out.println(i);
    }
}

class Solution {
    public int maximumGain(String s, int x, int y) {
        char[] array = s.toCharArray();
        char peek = 'a', cur = 'b';
        if(x < y) {
            cur = 'a';
            peek = 'b';
        }
        int count = 0;
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : array) {
            if (!stack.isEmpty() && c == cur && stack.peek() == peek) {
                count += Math.max(x, y);
                stack.pop();
                continue;
            }
            stack.push(c);
        }
        Deque<Character> stack1 = new ArrayDeque<>();
        for (Character c : stack) {
            if (!stack1.isEmpty() && c == cur && stack1.peek() == peek) {
                count += Math.min(x, y);
                stack1.pop();
                continue;
            }
            stack1.push(c);
        }

        return count;

    }
}