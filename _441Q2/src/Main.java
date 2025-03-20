import java.util.ArrayList;
import java.util.List;

/**
 * @Author 李Muzi
 * @Date 2025/3/16 11:29
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {1,3,1,4,1,3,2}, queries = {0,3,5};
        List<Integer> list = new Solution().solveQueries(nums, queries);
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}

class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < queries.length; i++) {
            int index = getMinLenIndex(nums, queries[i]);
            list.add(index);
        }
        return list;
    }

    private int getMinLenIndex(int[] nums, int index) {
        int  left = index, right = index, lenLeft = Integer.MAX_VALUE, lenRight = Integer.MAX_VALUE;

        for (int i = index + 1; i < nums.length; i++) {
            if (nums[i] == nums[index]) {
                lenRight = i - index;
                break;
            }
        }
        for (int i = index - 1; i >= 0; i--) {
            if (nums[i] == nums[index]) {
                lenLeft = index - i;
                break;
            }
        }
        int min = Math.min(lenLeft, lenRight);
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}