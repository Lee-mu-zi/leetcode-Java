import java.util.HashSet;

/**
 * @Author 李Muzi
 * @Date 2025/2/27 15:24
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        String s = "00110110";
        int k = 2;
        boolean b = new Solution().hasAllCodes(s, 2);
        System.out.println(b);
    }
}

class Solution {
    public boolean hasAllCodes(String s, int k) {
        HashSet<String> strings = new HashSet<>();
        for (int left = 0, right = left + k; right <= s.length(); left++, right++) {
            strings.add(s.substring(left, right));
        }
        return strings.size() == Math.pow(2, k);
    }
}