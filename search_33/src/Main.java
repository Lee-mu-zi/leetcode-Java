/**
 * @Author 李Muzi
 * @Date 2024/12/10 21:53
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2}, target = 0;
        int search = new Solution().search(nums, target);
        System.out.println(search);
    }
}

class Solution {
    public int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target) return i;
        }
        return -1;
    }
}