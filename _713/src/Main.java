/**
 * @Author 李Muzi
 * @Date 2025/3/7 15:23
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int nums[] = {10,5,2,6}, k = 100;
        int i = new Solution().numSubarrayProductLessThanK(nums, k);
        System.out.println(i);
    }
}

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if( k <= 1) return 0;
        int ans = 0;
        int prod = 1;
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            prod *= nums[right];
            while (prod >= k) {
                prod /= nums[left++];
            }
            //right - left + 1为新增数组
            ans += right - left + 1;
        }
        return ans;
    }
}