import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author 李Muzi
 * @Date 2025/2/28 10:45
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        String s1 = "ab", s2 = "eidbaooo";
        boolean b = new Solution().checkInclusion(s1, s2);
        System.out.println(b);
    }
}

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len = s1.length();
        char[] array1 = s1.toCharArray();
        Arrays.sort(array1);
        ArrayList<Integer> list = new ArrayList<>();
        for (int left = 0, right = left + len; right <= s2.length(); left++, right++) {
            char[] array2 = s2.substring(left, right).toCharArray();
            Arrays.sort(array2);
            if(Arrays.equals(array1, array2)) {
                list.add(left);
            };
        }
        return false;
    }
}