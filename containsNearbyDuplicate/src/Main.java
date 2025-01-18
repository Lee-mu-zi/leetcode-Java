import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int nums[] = {1,2,3,1}, k = 3;
        boolean b = solution.containsNearbyDuplicate(nums, k);
//        System.out.println(b);
    }
}

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Arrays.sort(nums);
        for (int num : nums) {
            System.out.println(num);
        }
        return true;
    }
}