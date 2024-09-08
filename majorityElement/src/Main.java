import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2,2,1,1,1,2,2};
        solution.majorityElement(nums);
    }
}

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i], 0) + 1);
        }

        long mid = nums.length >> 1; // 右移1能够向下取中位数

        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            if(entry.getValue() > mid){
                return entry.getKey();
            }
        }
        return -1;
    }
}