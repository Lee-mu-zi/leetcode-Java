public class Main {
    public static void main(String[] args) {
        int nums[] = {23,2,4,6,7}, k = 6;
        boolean b = new Solution().checkSubarraySum(nums, k);
        System.out.println(b);
    }
}

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int len = nums.length;
        int[] preSum = new int[len + 1];
        for (int i = 0; i < len; i++) {
            preSum[i + 1] = (preSum[i] + nums[i]) % k;
        }
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                int num = preSum[j + 1] - preSum[i];
                if(num % k == 0) return true;
            }
        }

        return false;
    }
}