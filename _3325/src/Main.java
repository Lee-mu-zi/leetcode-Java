/**
 * @Author 李Muzi
 * @Date 2025/3/7 8:22
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        String s = "abacb";
        int k = 2;
        int i = new Solution().numberOfSubstrings(s, k);
        System.out.println(i);
    }
}

class Solution {
    public int numberOfSubstrings(String s, int k) {
        char[] arr = s.toCharArray();
        int ans = 0;
        int left = 0;
        int[] ints = new int[26];
        for (int i = 0; i < arr.length; i++) {
            ints[arr[i] - 'a']++;
            while ( ints[arr[i] - 'a'] == k) {
                ints[arr[left] - 'a']--;
                left++;
            }
            ans += left;
        }
        return ans;
    }
}

