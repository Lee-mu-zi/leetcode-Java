import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        int[][] queries = {{1, 2}, {3, 4}, {2,3}, {-3,0}};
        int k = 2;
        int[] ints = new Solution().resultsArray(queries,k);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}


class Solution {
    public int[] resultsArray(int[][] queries, int k) {
        int len = queries.length;
        int[] res = new int[len];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int max = 0;
        for (int i = 0; i < len; i++) {
            int e = Math.abs(queries[i][0]) + Math.abs(queries[i][1]);
            pq.offer(e);
            if(pq.size() >= k) {
                res[i] = Math.min(max, e);
                max = e;
            } else {
                max = Math.max(e, max);
                res[i] = -1;
            }
        }
        return res;
    }

}