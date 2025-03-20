import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @Author 李Muzi
 * @Date 2025/3/16 11:05
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};
        int i = new Solution().maxSum(nums);
        System.out.println(i);
    }
}

class Solution {
    public int maxSum(int[] nums) {
        Set<Integer> integers = new HashSet<>();
        integers = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int ans = 0;
        for (Integer integer : integers) {
            if (integer > 0) {
                ans += integer;
            }

        }

        if (ans == 0) {
            ans = Integer.MIN_VALUE;
            for (Integer integer : integers) {
                ans = Math.max(ans, integer);
            }
        }
        return ans;
    }
}
