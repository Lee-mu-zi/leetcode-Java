import java.util.HashMap;

/**
 * @Author 李Muzi
 * @Date 2025/2/26 16:03
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int nums[] = {1,4,4,3}, k = 1;
        int i = new Solution().maxSubarrayLength(nums, k);
        System.out.println(i);
    }
}

class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int ans = 0;
        int left = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            while (map.get(nums[i]) > k) {
                map.put(nums[left], map.get(nums[left]) - 1);
                left++;
            }
            ans = Math.max(ans, i - left + 1);
        }
        return ans;
    }
}