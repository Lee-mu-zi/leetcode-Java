import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2,11,10,1,3};
        int k = 10;
        int i = new Solution().minOperations(nums, k);
        System.out.println("Hello world!");
    }
}

class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.offer((long) num);
        }
        int count = 0;
        while (pq.size() >= 2 && pq.peek() < k) {
            Long num = pq.poll();
            Long num2 = pq.poll();
            long temp = Math.min(num, num2) * 2 + Math.max(num, num2);
            pq.offer(temp);
            count++;
        }
        return count;
    }
}