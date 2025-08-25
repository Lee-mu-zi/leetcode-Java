public class Main {
    public static void main(String[] args) {
        int nums[] = {87,68,91,86,58,63,43,98,6,40};
        int i = new Solution().maximumDifference(nums);
        System.out.println(i);
    }
}

class Solution {
    public int maximumDifference(int[] nums) {
        int ans = 0;
        int preMin = Integer.MAX_VALUE;
        for (int num : nums) {
            ans = Math.max(ans, num - preMin);
            preMin = Math.min(preMin, num);
        }
        return ans > 0 ? ans : -1;
    }
}