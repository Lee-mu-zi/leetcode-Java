public class Main {
    public static void main(String[] args) {
        int[] nums = {2,5,6,9,10};
        int gcd = new Solution().findGCD(nums);
        System.out.println(gcd);
    }
}

class Solution {
    public int findGCD(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        while (max % min != 0) {
            int temp = max % min;
            max = min;
            min = temp;
        }
        return min;
    }
}

