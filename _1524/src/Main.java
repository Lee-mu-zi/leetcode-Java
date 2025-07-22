import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int i = new Solution().numOfSubarrays(arr);
        System.out.println(i);
    }
}

class Solution {
    public int numOfSubarrays(int[] arr) {
        final int MOD = 1000000007;
        int len = arr.length;
        int[] preSum = new int[len + 1];
        for (int i = 0; i < len; i++) {
            preSum[i + 1] = preSum[i] + arr[i];
        }
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < len; i++) {
            // 奇数为1，偶数为0
            if(preSum[i + 1] % 2 == 0) {
                res += map.getOrDefault(1, 0);
                res %= MOD;
                map.put(0, map.getOrDefault(0, 0) + 1);
            } else {
                res += map.getOrDefault(0, 0);
                map.put(1, map.getOrDefault(1, 0) + 1);
                res %= MOD;
            }
        }
        return res;
    }
}