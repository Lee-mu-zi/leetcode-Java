/**
 * @Author 李Muzi
 * @Date 2025/1/18 22:33
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int nums[] = {-5,-10,-5};
        int i = new Solution().maxAdjacentDistance(nums);
        System.out.println(i);
    }
}

class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int res = Math.abs(nums[nums.length - 1] - nums[0]);
        for (int i = 1; i < nums.length; i++) {
            res = Math.max(res, Math.abs(nums[i] - nums[i - 1]));
        }
        return res;
    }
}