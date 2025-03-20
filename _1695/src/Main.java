import java.util.HashSet;

/**
 * @Author 李Muzi
 * @Date 2025/2/26 14:45
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int nums[] = {187,470,25,436,538,809,441,167,477,110,275,133,666,345,411,459,490,266,987,965,429,166,809,340,467,318,125,165,809,610,31,585,970,306,42,189,169,743,78,810,70,382,367,490,787,670,476,278,775,673,299,19,893,817,971,458,409,886,434};
        int i = new Solution().maximumUniqueSubarray(nums);
        System.out.println(i);
    }
}

class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int ans = 0;
        int sum = 0;
        int left = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int right = 0; right < nums.length; right++) {
            while (set.contains(nums[right])) {
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
            set.add(nums[right]);
            sum += nums[right];
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
