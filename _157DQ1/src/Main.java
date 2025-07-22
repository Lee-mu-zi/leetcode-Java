public class Main {
    public static void main(String[] args) {
        int  n = 6, m = 5, k = 5;
        long l = new Solution().minCuttingCost(n, m, k);
        System.out.println(l);
    }
}

class Solution {
    public long minCuttingCost(int n, int m, int k) {
        int cost = 0;

        int i = n - k;
        int j = m - k;

        cost += i > 0 ? (i) * k : 0;
        cost += j > 0 ? (j) * k : 0;

        int max = Math.max(i, j);
        int min = Math.min(i, j);

        if(min >= k ) {
            cost += (min - k ) * k;
        } else if (max >= k) {
            cost += (max - k ) * k;
        } else if (max < k && max < k) {
            cost += (k - max) * (min - k + max);
        }

        return cost;
    }
}




