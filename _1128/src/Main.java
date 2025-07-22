import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int [][] dominoes = {{1,2},{2,1},{3,4},{5,6}};
        int i = new Solution().numEquivDominoPairs(dominoes);
        System.out.println(i);
    }
}

class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for (int[] dominoe : dominoes) {
            int mask = 0;
            for (int i : dominoe) {
                mask |= 1 << i;
            }
            int c = map.getOrDefault(mask, 0);
            ans += c;
            map.put(mask, c + 1);
        }
        return ans;
    }
}