public class Main {
    public static void main(String[] args) {
        int  cost[] = {1,2,4,6,7};
        int[] ints = new Solution().minCosts(cost);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}

class Solution {
    public int[] minCosts(int[] cost) {
        int length = cost.length;
        int min = cost[0];
        for (int i = 1; i < length; i++) {
            // 获取前i个数的最小值
            min = Math.min(min, cost[i]);
            cost[i] = min;
        }
        return cost;
    }
}