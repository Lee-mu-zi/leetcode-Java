public class Main {
    public static void main(String[] args) {
        int[] nums = {1,1,4,2,3};
        int x = 5;
        int i = new Solution().minOperations(nums, x);
        System.out.println(i);
    }
}

class Solution {
    public int minOperations(int[] nums, int x) {
        int maxLen = 0;
        int left = 0;
        int sum = 0;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum > x) {
                sum -= nums[left++];
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        int len = nums.length;
        if(maxLen == len) return -1;
        return len - maxLen;
    }
}