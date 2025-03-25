public class Main {
    public static void main(String[] args) {
        int candies[] = {3}, k = 1;
        int i = new Solution().maximumCandies(candies, k);
        System.out.println(i);
    }
}

class Solution {
    public int maximumCandies(int[] candies, long k) {
        int max = 0;
        for (int candy : candies) {
            max = Math.max(candy,max);
        }
        long right = max + 1;
        long left = 0;
        while (left + 1 < right) {
            long mid = (left + right) >>> 1;
            if(check(mid, candies, k)) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return (int) left;
    }

    private boolean check(long mid, int[] candies, long k) {
        long sum = 0;
        for (int candy : candies) {
            sum += candy / mid;
            if(sum >= k) {
                return true;
            }
        }
        return false;
    }
}