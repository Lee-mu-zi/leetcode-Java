import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int nums[] = {2,3,5,1,3};
        List<Boolean> booleans = new Solution().kidsWithCandies(nums, 3);
        for (boolean l : booleans) {
            System.out.println(l);
        }
    }
}

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int len = candies.length;
        int max = 0;
        for (int candy : candies) {
            max = Math.max(candy, max);
        }
        List<Boolean> list = new ArrayList<>();

        for (int candy : candies) {
            boolean b = (candy + extraCandies) >= max ? list.add(true) : list.add(false);
        }
        return list;
    }
}