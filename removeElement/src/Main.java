import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int k = solution.removeElement(nums, val);
        System.out.println(k);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        List<Integer> ints = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val) ints.add(nums[i]);
        }
        k = ints.size();
        for (int i = 0; i < k; i++) {
            nums[i] = ints.get(i);
        }
        return k;
    }
}