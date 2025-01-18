/**
 * @Author 李Muzi
 * @Date 2024/10/22 18:52
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {11,11,9,4,3,3,3,1,-1,-1,3,3,3,5,5,5};
        boolean monotonic = solution.isMonotonic(nums);
        System.out.println(monotonic);
    }
}

class Solution {
    public boolean isMonotonic(int[] nums) {
        for (int i = 1; i < nums.length - 1; ) {
            if( (nums[i] <= nums[i-1] && nums[i] >= nums[i + 1]) || (nums[i - 1] <= nums[i] && nums[i] <= nums[i + 1]) ) {
                i++;
            } else {
                return false;
            }
        }
        return true;
    }

}