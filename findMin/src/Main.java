/**
 * @Author 李Muzi
 * @Date 2024/12/15 22:48
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        int min = new Solution().findMin(nums);
        System.out.println(min);
    }
}

class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int left = 0, right = n - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[n -1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return nums[right];
    }
}