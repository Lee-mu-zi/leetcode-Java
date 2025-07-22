import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        int[] nums = {6,3,3,2};
        int k = 2;
        int i = new Solution().maximumProduct(nums, k);
        System.out.println(i);
    }
}

class Solution {
    public int maximumProduct(int[] nums, int k) {
        final int MOD = 1000000007;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int num : nums) {
            queue.offer(num);
        }
        for (int i = 0; i < k; i++) {
            int temp = queue.poll() + 1;
            queue.offer(temp);
        }

        long res = 1L;
        for (Integer i : queue) {
            res = res * i % MOD;
        }
        return (int) res;
    }
}