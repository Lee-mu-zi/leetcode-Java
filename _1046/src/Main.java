import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        int[] stones = {2,7,4,1,8,1};
        int i = new Solution().lastStoneWeight(stones);
        System.out.println(i);
    }
}

class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int stone : stones) {
            pq.offer(stone);
        }
        while (pq.size() > 1) {
            int a = pq.poll();
            int b = pq.poll();
                pq.offer(a - b);
        }
        return pq.isEmpty() ? 0 : pq.poll();
    }
}