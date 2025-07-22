public class Main {
    public static void main(String[] args) {
        int[] nums = {4,3,1,6};
        int[][] queries = {{0, 2}, {2, 3}};
        boolean[] arraySpecial = new Solution().isArraySpecial(nums, queries);
        for (boolean b : arraySpecial) {
            System.out.println(b);
        }
    }
}

class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] s = new int[n];
        for (int i = 0; i < n - 1; i++) {
            int value = nums[i] % 2 == nums[i + 1] % 2 ? 1 : 0;
            s[i + 1] = s[i] + value;
        }

        int len = queries.length;
        boolean[] res = new boolean[len];
        for (int i = 0; i < len; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            res[i] = s[right] - s[left] == 0;
        }
        return res;
    }
}