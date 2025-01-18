import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int nums[] = {-1,-12,-5,-6,-50,-3}, k = 4;
        double maxAverage = new Solution().findMaxAverage(nums, k);
        System.out.println(maxAverage);
    }
}

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int len = nums.length;
        double sum = 0;
        if(len <= k) {
            for (int num : nums) {
                sum += num;
            }
            return sum / len;
        }
        double max = -99999999.0;
        for (int i = 0; i + k <= nums.length; i++) {
            int[] ints = Arrays.copyOfRange(nums, i, i + k);
            sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            max = Math.max(max ,sum);
        }
        return max / k;
    }
}