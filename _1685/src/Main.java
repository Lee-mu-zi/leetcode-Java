public class Main {
    public static void main(String[] args) {
        int[] nums = {2,3,5};
        int[] sumAbsoluteDifferences = new Solution().getSumAbsoluteDifferences(nums);
        for (int sumAbsoluteDifference : sumAbsoluteDifferences) {
            System.out.println(sumAbsoluteDifference);
        }
    }
}

class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int len = nums.length;
        int[] preSum = new int[len + 1];
        for (int i = 0; i < len; i++) {
            preSum[i + 1] = preSum[i] + nums[i];
        }


        int[] output = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            output[i] = (i+1)*nums[i]-preSum[i + 1]+ preSum[nums.length]-preSum[i + 1]-nums[i]*(nums.length-1-i);
        }
        return output;

    }
}