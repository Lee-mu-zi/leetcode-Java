import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        int k = 4;
        String s = new Solution().removeDuplicates("yfttttfbbbbnnnnffbgffffgbbbbgssssgthyyyy", k);
        System.out.println(s);
    }
}

class Solution {
    public String removeDuplicates(String s, int k) {
        int[] ints = new int[26];
        Deque<Character> stack = new ArrayDeque<>();
        char[] array = s.toCharArray();
        for (char c : array) {
            if(!stack.isEmpty() && ints[c - 'a'] == k - 1) {
                while(ints[c - 'a'] != 0) {
                    stack.pop();
                    ints[c - 'a']--;
                }
                continue;
            }
            stack.push(c);
            ints[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        stack.forEach(sb::append);
        return sb.reverse().toString();
    }
}