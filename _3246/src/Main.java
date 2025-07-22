import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        int nums[] = {2,1,3,5,6}, k = 5, multiplier = 2;
        int[] finalState = new Solution().getFinalState(nums, k, multiplier);
        for (int i : finalState) {
            System.out.println(i);
        }
    }
}

class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int num : nums) {
            queue.offer(num);
        }
        for (int i = 0; i < k; i++) {
            Integer poll = queue.poll();
            queue.offer(poll * multiplier);
        }
        int i = 0;
        for (Integer q : queue) {
            nums[i++] = q;
        }
        return nums;
    }
}