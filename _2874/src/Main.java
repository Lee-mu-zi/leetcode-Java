/**
 * @Author 李Muzi
 * @Date 2025/2/24 13:25
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int nums[] = {12,6,1,2,7};
        long l = new Solution().maximumTripletValue(nums);
        System.out.println(l);
    }
}

class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        int[] sufMax = new int[n + 1];
        for (int i = n - 1; i > 1; i--) {
                sufMax[i] = Math.max(sufMax[i + 1], nums[i]);
        }
        long ans = 0;
        int preMax = nums[0];
        for (int j = 1; j < n - 1; j++) {
            ans = Math.max(ans, (long) (preMax - nums[j]) * sufMax[j + 1]);
            preMax = Math.max(preMax, nums[j]);
        }
        return ans;
    }
}