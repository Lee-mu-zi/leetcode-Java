public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,1,1,2,2,3};
        int i = solution.removeDuplicates(nums);
        System.out.println(i);
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if(len <= 2 ){
            return len;
        }
        int slow = 2, fast = 2;
        while(fast < len) {
            if (nums[slow - 2] != nums[fast]) {
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        return slow;
    }
}