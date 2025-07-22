import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int nums[] = {4,5,0,-2,-3,1}, k = 5;
        int i = new Solution().subarraysDivByK(nums, k);
        System.out.println(i);
    }
}

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int len = nums.length;
        int[] preSum = new int[len + 1];
        for (int i = 0; i < len; i++) {
            preSum[i + 1] = preSum[i] + nums[i];
        }
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {



        }
        return ans;
    }
}