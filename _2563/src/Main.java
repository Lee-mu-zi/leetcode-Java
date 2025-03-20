import java.util.Arrays;

/**
 * @Author 李Muzi
 * @Date 2025/3/11 20:37
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int nums[] = {0,1,7,4,4,5}, lower = 3, upper = 6;
        long l = new Solution().countFairPairs(nums, lower, upper);
        System.out.println(l);
    }
}

class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long ans = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] >= lower && nums[i] + nums[j] <= upper) ans++;
            }
        }
        return ans;
    }
}