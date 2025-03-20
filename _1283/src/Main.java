/**
 * @Author 李Muzi
 * @Date 2025/3/17 11:22
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int nums[] = {44, 22, 33, 11, 1}, threshold = 5;
        int i = new Solution().smallestDivisor(nums, threshold);
        System.out.println(i);
    }
}

class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 0;
        int right = 0;
        // 求谁就二分谁，要求的是最小的除数是数组的和小于threshold 所以二分除数
        for (int num : nums) {
            right = Math.max(right, num);
        }
        while (left + 1 < right) {
            int mid = (left + right) >>> 1;
            if (check(nums, mid, threshold)) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return right;
    }

    private boolean check(int[] nums, int mid, int threshold) {
        int sum = 0;
        for (int num : nums) {
            sum += (num + mid - 1) / mid;
            if(sum > threshold) return false;
        }
        return true;
    }
}