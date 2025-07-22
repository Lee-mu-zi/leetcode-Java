import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,3};
        int i = new Solution().minDeletion(nums);
        System.out.println(i);
    }
}

class Solution {
    public int minDeletion(int[] nums) {
        Deque<Integer> stack = new ArrayDeque<>();
        int index = 0;
        for (int num : nums) {
            if (!stack.isEmpty() && num == stack.peek() && index % 2 == 0) {
                continue;
            }
            stack.push(num);
            index++;
        }
        int ans = nums.length - stack.size();
        return stack.size() % 2 == 0 ? ans : ans + 1;
    }
}