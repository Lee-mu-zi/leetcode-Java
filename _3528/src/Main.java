/**
 * @Author 李Muzi
 * @Date 2025/3/9 22:13
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        String s = "10101";
        int k = 1;
        int i = new Solution().countKConstraintSubstrings(s, k);
        System.out.println(i);
    }
}

class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        char[] arr = s.toCharArray();
        int left = 0;
        int ans = 0;
        int[] nums = new int[2];
        for (int right = 0; right < arr.length; right++) {
            nums[arr[right] - '0']++;
            while (nums[0] > k && nums[1] > k) {
                nums[arr[left] - '0']--;
                left++;
            }
            ans += right - left + 1;
        }
        return ans;
    }
}