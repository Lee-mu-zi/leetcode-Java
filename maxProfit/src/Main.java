public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] prices = {7,1,5,3,6,4};
        solution.maxProfit(prices);
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            int tmp = prices[i] - prices[i - 1];
            if (tmp > 0)
                profit = profit + tmp;
        }
        return profit;
    }
}