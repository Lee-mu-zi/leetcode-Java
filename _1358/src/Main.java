/**
 * @Author 李Muzi
 * @Date 2025/3/6 22:19
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        String s = "abcabc";
        int i = new Solution().numberOfSubstrings(s);
        System.out.println(i);
    }
}

class Solution {
    public int numberOfSubstrings(String s) {
        char[] arr = s.toCharArray();
        int ans = 0;
        int left = 0;
        int[] ints = new int[3];
        for (char c : arr) {
            ints[c - 'a']++;
            while (ints[0] > 0 && ints[1] > 0 && ints[2] > 0) {
                ints[arr[left]-'a']--;
                left++;
            }
            ans += left;
        }
        return ans;
    }
}