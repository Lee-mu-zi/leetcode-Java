/**
 * @Author 李Muzi
 * @Date 2025/3/17 14:00
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1,28,21}, nums2 = {9,21,20};
        int i = new Solution().minAbsoluteSumDiff(nums1, nums2);
        System.out.println(i);
    }
}

class Solution {
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int ans = 0;
        //获取差值位置最大的位置index。
        int index = 0, max = 0;
        for (int i = 0; i < nums1.length; i++) {
            int temp = Math.abs(nums1[i] - nums2[i]);
            if(temp > max) {
                max = temp;
                // 获取到差值在nums2中最大的位置，
                index = i;
            }
        }
        //在nums1中找到与下标index差值最小的那个数
        int num = getMin(nums1, nums2[index]);
        // 替换差值最小的数
        nums1[index] = num;
        //获取绝对差值和
        for (int i = 0; i < nums1.length; i++) {
            ans += Math.abs(nums1[i] - nums2[i]);
        }
        return ans % (1000000007);
    }

    private int getMin(int[] nums1, int i) {
        int ans = 0;
        int k = Integer.MAX_VALUE;
        for (int j = 0; j < nums1.length; j++) {
            int temp = Math.abs(j - i);
            if(temp < k) {
                k = temp;
                ans = j;
            }
        }
        return ans;
    }
}