import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        int[] gifts = {25,64,9,4,100};
        int k = 4;
        long l = new Solution().pickGifts(gifts, k);
        System.out.println(l);
    }
}

class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int gift : gifts) {
            pq.offer(gift);
        }
        for (int i = 0; i < k; i++) {
            Integer poll = pq.poll();
            Integer sqrt = (int) Math.sqrt(poll);
            pq.offer(sqrt);
        }
        long res = 0;
        for (Integer i : pq) {
            res += i;
        }
        return res;
    }
}