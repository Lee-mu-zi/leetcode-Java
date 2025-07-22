import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2}, nums2 = {1, 3, 4, 2};
        int[] ints = new Solution().nextGreaterElement(nums1, nums2);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = nums1.length;
        for (int i = 0; i < len; i++) {
            map.put(nums1[i], i);
        }
        int[] ints = new int[len];
        Arrays.fill(ints, -1);
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i : nums2) {
            while (!stack.isEmpty() && i > stack.peek()) {
                ints[map.get(stack.pop())] = i;
            }
            if(map.containsKey(i)) {
                stack.push(i);
            }
        }
        return ints;
    }
}