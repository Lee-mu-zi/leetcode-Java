import java.util.Arrays;

/**
 * @Author 李Muzi
 * @Date 2024/10/30 18:04
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int nums[] = {9,4,1,7}, k = 2;
        int i = new Solution().minimumDifference(nums, k);
        System.out.println(i);
    }
}

class Solution {
    public int minimumDifference(int[] nums, int k) {
        int res = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i + k - 1 < nums.length; i++) {
            res = Math.min(res, nums[i + k - 1] - nums[i]);
        }
        return res;
    }
}