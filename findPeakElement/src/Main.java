/**
 * @Author 李Muzi
 * @Date 2024/12/15 22:14
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int nums[] = {1,2,3,1};
        int peakElement = new Solution().findPeakElement(nums);
        System.out.println(peakElement);
    }
}

class Solution {
    public int findPeakElement(int[] nums) {
        int left = -1, right = nums.length - 1;
        while (left + 1< right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return right;
    }
}