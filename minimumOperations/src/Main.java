import java.util.Arrays;

/**
 * @Author 李Muzi
 * @Date 2024/12/22 10:32
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,2,3,3,5,7};
        int i = new Solution().minimumOperations(nums);
        System.out.println(i);
    }
}

class Solution {
    public int minimumOperations(int[] nums) {
        if(nums.length == 0 || isDiff(nums)) return 0;
        int count = 1;
        int left = 3, right = nums.length;
        int ints[] = {};
        while (left < right ) {
            ints = Arrays.copyOfRange(nums, left, right );
            if(!isDiff(ints)) {
                left += 3;
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public boolean isDiff(int[] nums) {
        int[] ints = Arrays.copyOf(nums, nums.length);
        Arrays.sort(ints);
        for (int i = 1; i < ints.length; i++) {
            if (ints[i] == ints[i - 1]) {
                return false;
            }
        }
        return true;
    }
}