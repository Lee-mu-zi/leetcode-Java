public class Main {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        Solution solution = new Solution();
        int[] results = solution.buildArray(nums);
        for (int result : results) {
            System.out.println(result);
        }
    }
}

class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

}

