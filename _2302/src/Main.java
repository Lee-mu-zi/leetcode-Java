/**
 * @Author 李Muzi
 * @Date 2025/3/10 12:05
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int nums[] = {2,1,4,3,5}, k = 10;
        long l = new Solution().countSubarrays(nums, k);
        System.out.println(l);
    }
}

class Solution {
    public long countSubarrays(int[] nums, long k) {
        long ans = 0;
        int left = 0;
        long sum = 0;
        int len = 0;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            len = right - left + 1;
            while (sum >= k || sum * len >= k) {
                sum -= nums[left++];
                len = right - left + 1;
            }
            ans += right - left + 1;
        }
        return ans;
    }
}