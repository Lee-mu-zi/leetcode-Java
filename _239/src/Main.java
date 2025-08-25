import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        int nums[] = {1,3,-1,-3,5,3,6,7}, k = 3;
        int[] ints = new Solution().maxSlidingWindow(nums, k);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length - k + 1];
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 0, temp = 0; i < nums.length; i++) {
            queue.offer(nums[i]);
            if (queue.size() == k) {
                ans[temp] = queue.peek();
                temp++;
                queue.remove(nums[i - k + 1]);
            }
        }
        return ans;
    }
}