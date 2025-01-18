/**
 * @Author 李Muzi
 * @Date 2024/12/21 21:33
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {2,2,2,0,1};
        int min = new Solution().findMin(nums);
        System.out.println(min);
    }
}

class Solution {
    public int findMin(int[] nums) {
        int left = -1, right = nums.length - 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[right]) right = mid;
            else if (nums[mid] > nums[right]) left = mid;
            else right--;
        }
        return nums[right];
    }
}