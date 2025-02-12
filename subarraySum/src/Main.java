/**
 * @Author 李Muzi
 * @Date 2025/1/19 10:31
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int nums[] = {3,1,1,2};
        int i = new Solution().subarraySum(nums);
//        System.out.println(i);
    }
}

class Solution {
    public int subarraySum(int[] nums) {
        int res = 0;
        int[] ints = new int[nums.length];
        ints[0] = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int start = Math.max(0, i - nums[i]);
            int temp = nums[i];
            for (int j = start; j < i; j++) {
                temp += nums[j];
                ints[i] = temp;
            }
        }
        for (int anInt : ints) {
            res += anInt;
        }
        return res;
    }
}