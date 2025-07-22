import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int nums[] = {7,2,4}, k = 2;
        int[] ints = new Solution().maxSlidingWindow(nums, k);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        // 创建队列
        ArrayDeque<Integer> integers = new ArrayDeque<>();
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            integers.offer(num);
            max = Math.max(num, max);
            if (integers.size() == k) {
                list.add(max);
                int first = integers.removeFirst();
                // 如果num > max
                if(num >= max) {
                    max = num;
                } else {

                }
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}