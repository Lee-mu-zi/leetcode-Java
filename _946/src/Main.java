import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        int[] pushed = {1, 2, 3, 4, 5}, popped = {4,5,3,2,1};
        boolean b = new Solution().validateStackSequences(pushed, popped);
        System.out.println(b);
    }
}

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0, j = 0; i < pushed.length; i++) {
            stack.push(pushed[i]);
            while (!stack.isEmpty() && stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
        }
        if (stack.isEmpty()) return true;
        return false;
    }
}