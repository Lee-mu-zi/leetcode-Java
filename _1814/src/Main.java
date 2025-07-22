import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int nums[] = {42,11,1,97};
        int i = new Solution().countNicePairs(nums);
        System.out.println(i);
    }
}

class Solution {
    public int countNicePairs(int[] nums) {
        // nums[i] - rev(nums[i]) == nums[j] - rev(nums[j])
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int temp = num - rev(num);
            int c = map.getOrDefault(temp, 0);
            ans = (ans + c) % 1000000007;
            map.put(temp, c + 1);
        }
        return ans ;
    }

    private int rev(int num) {
        String str = new StringBuilder(String.valueOf(num)).reverse().toString();
        return Integer.parseInt(str);
    }
}