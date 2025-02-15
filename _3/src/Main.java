import java.util.HashSet;

/**
 * @Author 李Muzi
 * @Date 2025/2/13 22:16
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        String  s = "pwwkew";
        int i = new Solution().lengthOfLongestSubstring(s);
        System.out.println(i);
    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0;
        int length = 0;
        while (left < s.length()) {
            HashSet<Character> set = new HashSet<>();
            while (right < s.length()) {
                if(!set.add(s.charAt(right))){
                    break;
                }
                right++;
            }
            right = left++;
            length = Math.max(length, set.size());
        }
        return length;
    }
}