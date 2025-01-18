import java.util.Arrays;

/**
 * @Author 李Muzi
 * @Date 2024/12/17 21:33
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int nums1[] = {1, 2}; int nums2[] = {3,4};
        double medianSortedArrays = new Solution().findMedianSortedArrays(nums1, nums2);
        System.out.println(medianSortedArrays);
    }
}

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        int len = nums1.length;
        for (int i = 0; i < len; i++) {
            nums[i] = nums1[i];
        }
        for (int i = 0; i != nums2.length; i++) {
            nums[len + i] = nums2[i];
        }
        Arrays.sort(nums);

        if(nums.length % 2 != 0){
            return nums[nums.length / 2];
        } else {
            return (double) (nums[nums.length / 2 - 1] + nums[nums.length / 2]) / 2;
        }
    }
}