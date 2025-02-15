import java.util.HashMap;

/**
 * @Author 李Muzi
 * @Date 2025/2/15 21:39
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        String s = "bcbbbcba";
        int i = new Solution().maximumLengthSubstring(s);
        System.out.println(i);
    }
}

class Solution {
    public int maximumLengthSubstring(String s) {
        int res = 0;
        for (int left = 0; left < s.length(); left++) {
            HashMap<Character, Integer> hashMap = new HashMap<>();
            for (int right = left; right < s.length(); right++) {
                if(hashMap.get(s.charAt(right)) != null || hashMap.get(s.charAt(right)) == 2) {
                    int size = hashMap.size();
                    res = Math.max(res, size);
                };
                hashMap.put(s.charAt(right), hashMap.getOrDefault(s.charAt(right), 0) + 1);
            }
        }
        return res;
    }
}