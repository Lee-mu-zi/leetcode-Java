import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int nums[] = {4,1,3,3};
        long l = new Solution().countBadPairs(nums);
        System.out.println(l);
    }
}

class Solution {
    public long countBadPairs(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        long ans = (long) n * (n - 1) / 2;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i] - i;
            int c = map.getOrDefault(temp, 0);
            ans -= c;
            map.put(temp, c + 1);
        }
        return ans;
    }
}