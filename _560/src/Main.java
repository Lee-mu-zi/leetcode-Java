import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int nums[] = {1, 1, 1}, k = 2;
        int i = new Solution().subarraySum(nums, k);
        System.out.println(i);
    }
}

class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans = 0;
        int n = nums.length;
        int[] sum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            sum[i + 1] = sum[i] + nums[i];
        }
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < n; i++) {
            int rightSum = sum[i + 1];
            int leftSum = rightSum - k;
            ans += map.getOrDefault(leftSum, 0);
            map.put(rightSum, map.getOrDefault(rightSum, 0) + 1);
        }
        return ans;
    }
}