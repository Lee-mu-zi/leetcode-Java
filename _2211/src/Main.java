import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        int i = new Solution().countCollisions("SSRSSRLLRSLLRSRSSRLRRRRLLRRLSSRR");
        System.out.println(i);
    }
}

class Solution {
    public int countCollisions(String directions) {
        int count = 0;
        Deque<Character> stack = new ArrayDeque<>();
        char[] arr = directions.toCharArray();
        for (char c : arr) {
            if (!stack.isEmpty() && c == 'L' && stack.peek() == 'R') {
                stack.push('S');
                count += 2;
            } else if (!stack.isEmpty() && c == 'L' && stack.peek() == 'S') {
                stack.push('S');
                count++;
            } else if (!stack.isEmpty() && c == 'S' && stack.peek() == 'R') {
                stack.push(c);
                count++;
            } else {
                stack.push(c);
            }
        }
        return count;
    }
}