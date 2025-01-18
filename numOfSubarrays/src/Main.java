import java.util.Arrays;

/**
 * @Author 李Muzi
 * @Date 2024/10/25 16:50
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int arr[] = {4,4,4,4}, k = 4, threshold = 1;
        int i = new Solution().numOfSubarrays(arr, k, threshold);
        System.out.println(i);
    }
}

class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        if(k == 1) {
            for (int i : arr) {
                if( i >= threshold) count++;
            }
            return count;
        }
        for (int left = 0; left < arr.length - k + 1; left++) {
            int right = left + k;
            int[] nums = Arrays.copyOfRange(arr, left, right);
            int sum = 0;
            for (int num : nums) {
                sum += num;
            }
            if( sum / k >= threshold) count++;
        }
        return count;
    }
}