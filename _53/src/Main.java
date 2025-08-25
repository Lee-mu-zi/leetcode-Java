public class Main {
    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        int i = new Solution().maxSubArray(nums);
        System.out.println(i);
    }
}

class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int ans = Integer.MIN_VALUE;
        int left = 0, right = nums.length - 1;
        while (left != right) {
            if (nums[left] >= nums[right]) {
                sum -= nums[right];
                right--;
            } else {
                sum -= nums[left];
                left++;
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}