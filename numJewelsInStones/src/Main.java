import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String jewels = "aA", stones = "aAAbbbb";
        int i = solution.numJewelsInStones(jewels,stones);

        System.out.println(i);
    }
}

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int length = jewels.length();
        int ans = 0;
        for (int i = 0; i < length; i++) {
            char c = jewels.charAt(i);
            for (int j = 0; j < stones.length(); j++) {
                if(stones.charAt(j) == c){
                    ans++;
                }
            }
        }
        return ans;
    }
}