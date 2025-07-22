import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        long l = new Solution().calculateScore("aczzx");
        System.out.println(l);
    }
}

class Solution {
    public long calculateScore(String s) {
        int ans = 0;
        Deque<Character> stack = new ArrayDeque<>();
        char[] arr = s.toCharArray();
        for (char c : arr) {
            while (!stack.isEmpty() && stack.peek() == c) {

            }
        }
        return ans;
    }
}