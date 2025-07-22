import java.util.HashMap;

/**
 * @Author 李Muzi
 * @Date 2025/3/11 10:25
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int nums[] = {1,0,1,0,1}, goal = 2;
        int i = new Solution().numSubarraysWithSum(nums, goal);
        System.out.println(i);
    }
}

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        // 前缀和 哈希表 枚举右维护左
        int n = nums.length;
        // 数组全部子数组有 n * (n + 1) / 2个
        int[] preSum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            preSum[i + 1] = preSum[i] + nums[i];
        }
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            int rightSum = preSum[i + 1];
            int leftSum = rightSum - goal;
            ans += map.getOrDefault(leftSum, 0);
            map.put(rightSum, map.getOrDefault(rightSum, 0) + 1);
        }
        return ans;
    }
}
