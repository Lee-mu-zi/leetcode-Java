import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        String s = "leet**cod*e";
        String s1 = new Solution().removeStars(s);
        System.out.println(s1);
    }
}

class Solution {
    public String removeStars(String s) {
        char[] array = s.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : array) {
            if(c == '*'){
                stack.pop();
                continue;
            }
            stack.push(c);
        }
        StringBuilder ans = new StringBuilder();
        for (Character c : stack) {
            ans.insert(0, c);
        }
        return ans.toString();
    }
}