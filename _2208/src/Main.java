import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        int[] nums = {5,19,8,1};
        int i = new Solution().halveArray(nums);
        System.out.println(i);
    }
}

class Solution {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> pq = new PriorityQueue<>((a, b) -> b.compareTo(a));
        double sum = 0;
        for (int num : nums) {
            pq.offer((double) num);
            sum += num;
        }
        double half = sum / 2.0;
        int count = 0;
        while (sum > half) {
            double v = pq.poll() / 2;
            pq.offer(v);
            sum -= v;
            count++;
        }

        return count;
    }
}