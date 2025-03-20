import java.util.Arrays;

/**
 * @Author 李Muzi
 * @Date 2025/3/6 22:36
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int nums[] = {1, 3, 2, 3, 3}, k = 2;
        long l = new Solution().countSubarrays(nums, k);
        System.out.println(l);
    }
}

class Solution {
    public long countSubarrays(int[] nums, int k) {
        int[] ints = Arrays.copyOf(nums, nums.length);
        Arrays.sort(ints);
        int max = ints[ints.length - 1];
        long ans = 0;
        int left = 0, count = 0;
        for (int num : nums) {
            if (num == max) {
                count++;
            }
            while (count == k) {
                if (nums[left] == max) {
                    count--;
                }
                left++;
            }
            ans += left;
        }
        return ans;
    }
}