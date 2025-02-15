import java.util.ArrayList;

/**
 * @Author 李Muzi
 * @Date 2025/2/15 22:39
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int nums[] = {2,1}, k = 1;
        int i = new Solution().sumOfGoodNumbers(nums, k);
        System.out.println(i);
    }
}

class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int left = i - k, right = i + k;
            if( left >= 0 && right < nums.length && nums[i] > nums[left] && nums[i] > nums[right]) {
                list.add(nums[i]);
            } else if (left >= 0 && right >= nums.length && nums[i] > nums[left]) {
                list.add(nums[i]);
            } else if(left < 0 && right < nums.length && nums[i] > nums[right]) {
                list.add(nums[i]);
            }
        }
        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        return sum;
    }
}