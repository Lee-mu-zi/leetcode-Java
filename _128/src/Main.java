import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int nums[] = {100,4,200,1,3,2};
        int i = new Solution().longestConsecutive(nums);
        System.out.println(i);
    }
}

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int ans = 0;
        for (Integer x : set) {
            if(set.contains(x - 1)) {
                continue;
            }

            int y = x + 1;
            while(set.contains(y)) {
                y++;
            }
            ans = Math.max(ans, y - x);
        }

        return ans;
    }
}