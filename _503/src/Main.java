import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        int nums[] = {1, 2, 1};
        int[] ints = new Solution().nextGreaterElements(nums);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int length = nums.length;
        int[] numsTemp = new int[2 * length];
        for (int i = 0; i < nums.length; i++) {
            numsTemp[i] = nums[i];
            numsTemp[ i + length] = nums[i];
        }
        Deque<Integer> stack = new ArrayDeque<>();
        Arrays.fill(nums, -1);
        for (int i = 0; i < numsTemp.length; i++) {
            while (!stack.isEmpty() && numsTemp[i] > numsTemp[stack.peek()]) {
                nums[stack.pop()] = numsTemp[i];
            }
            stack.push(i);
        }
        return nums;
    }
}