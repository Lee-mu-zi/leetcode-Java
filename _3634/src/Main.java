import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,6,2,9};
        int k = 3;
        int i = new Solution().minRemoval(nums, k);
        System.out.println(i);
    }
}

class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int maxSave = 0;
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            while (left * k < nums[i]) {
                left++;
            }
            maxSave = Math.max(maxSave, i - left + 1);
        }
        return nums.length - maxSave;
    }
}