import java.util.HashSet;

/**
 * @Author 李Muzi
 * @Date 2025/2/12 21:45
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int nums[] = {4,4,4}, k = 3;
        long l = new Solution().maximumSubarraySum(nums, k);
        System.out.println(l);
    }
}

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long max = 0L;
        long sum = 0L;
        for (int left = 0, right = k - 1; right < nums.length; left++, right++) {

            HashSet<Integer> integers = new HashSet<>();
            for (int i = left; i <= right; i++) {
                boolean add = integers.add(nums[i]);
                if (!add) {
                    sum = 0;
                    break;
                }
                sum += nums[i];
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
