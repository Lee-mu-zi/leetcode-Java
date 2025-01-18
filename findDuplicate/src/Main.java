import java.util.Arrays;

/**
 * @Author 李Muzi
 * @Date 2024/12/21 22:16
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        int duplicate = new Solution().findDuplicate(nums);
        System.out.println(duplicate);
    }
}

class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return nums[i];
            }
        }
        return -1;
    }
}

//class Solution {
//    public int findDuplicate(int[] nums) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int num : nums) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
//        for (Map.Entry<Integer, Integer> entry : entries) {
//            if(entry.getValue() > 1) return entry.getKey();
//        }
//        return -1;
//    }
//}