import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int nums[] = {1,2,3,1,1,3};
        int i = new Solution().numIdenticalPairs(nums);
        System.out.println(i);
    }
}

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int c = map.getOrDefault(num, 0);
            ans += c;
            map.put(num, c + 1);
        }
        return ans;
    }
}