import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] nums = {8,4,2,8,4};
        int i = new Solution().specialTriplets(nums);
        System.out.println(i);
    }
}

class Solution {
    public int specialTriplets(int[] nums) {
        final int MOD = 1000000007;
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : nums) {
            Integer i = map.get(num * 2);
            res = i == null ? res : (res + i * (i - 1) / 2) ;
        }
        return res % MOD;
    }
}