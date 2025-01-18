public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int[] shuffle = solution.shuffle(nums,n);
        for (int i : shuffle) {
            System.out.println(i);
        }
    }
}

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[nums.length];
        for (int i = 0; i < n; i++) {
            res[2 * i] = nums[i];
            res[2 * i + 1] = nums[i + n];
        }
        return res;
    }
}