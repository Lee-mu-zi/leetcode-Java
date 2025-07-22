import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        int[] piles = {5,4,9};
        int k = 2;
        int i = new Solution().minStoneSum(piles, k);
        System.out.println(i);
    }
}

class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int pile : piles) {
            pq.offer(pile);
        }

        for (int i = 0; i < k; i++) {
            Integer poll = pq.poll();
            poll = (int) Math.ceil(poll / 2);
            pq.offer(poll);
        }

        int sum = 0;
        for (Integer i : pq) {
            sum += i;
        }
        return sum;
    }
}