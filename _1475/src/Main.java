import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        int[] prices = {8,7,4,2,8,1,7,7,10,1};
        int[] ints = new Solution().finalPrices(prices);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}

class Solution {
    public int[] finalPrices(int[] prices) {
        Deque<Integer> integers = new ArrayDeque<>();
        for (int i = 0,j = 0; i < prices.length; i++) {
            int num = prices[i];
            integers.push(num);
            while (integers.size() > 1 && integers.getFirst() <= integers.getLast()) {
                prices[j] = integers.getLast() - integers.getFirst();
                integers.removeLast();
                j++;
            }
        }
        return prices;
    }
}