import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 2, 1};
        int i = solution.thirdMax(nums);
        System.out.println(i);
    }
}

class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1, j = 1; i > 0; i--) {
            if( nums[i - 1] != nums[i]) {
                j++;
                if( j == 3) {
                    return nums[i - 1];
                }
            }
        }
        return nums[nums.length - 1];
    }
}