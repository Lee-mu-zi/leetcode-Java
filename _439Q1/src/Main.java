import java.util.HashSet;

/**
 * @Author 李Muzi
 * @Date 2025/3/2 10:41
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int nums[] = {3, 9, 2, 1, 7};
        int k = 3;
        int i = new Solution().largestInteger(nums, k);
        System.out.println(i);
    }
}

class Solution {
    public int largestInteger(int[] nums, int k) {
        int res = -1;
        int left = nums[0];
        int right = nums[nums.length - 1];
        if(nums.length == k) return Math.max(left, right);
        if (left == right) {
            return res;
        }
        HashSet<Integer> integers = new HashSet<>();
        for (int i = 1; i < nums.length - 2; i++) {
            if (nums[i] == left || nums[i] == right) integers.add(nums[i]);
        }
        if (integers.size() == 2) {
            return res;
        } else if (integers.size() == 0) {
            return Math.max(left, right);
        } else {
            return integers.contains(left) ? right : left;
        }
    }
}