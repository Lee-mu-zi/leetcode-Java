import java.util.Arrays;

/**
 * @Author 李Muzi
 * @Date 2024/10/26 22:33
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int nums[] = {8}, k = 100000;
        int[] averages = new Solution().getAverages(nums, k);
        for (int average : averages) {
            System.out.println(average);
        }
    }
}

class Solution {
    public int[] getAverages(int[] nums, int k) {
        int len = nums.length;
        int[] res = new int[len];
        Arrays.fill(res, -1);
        if(len <= 2 * k) {
            return res;
        }
        long sum = 0;
        // 获取前2k项的和
        for (int i = 0; i <= 2 * k; i++) {
            sum += nums[i];
        }
        int avgLen = 2 * k + 1;
        res[k] = (int) (sum / avgLen);
        //从2k + 1项开始增加新的，去除头部旧的，获取平均值，每个截取的子数组定长为2k + 1
        for (int i = 1; i < len - 2 * k; i++) {
            sum = sum - nums[i - 1] + nums[ i + 2 * k];
            res[i + k] = (int) (sum / avgLen);
        }
        return res;
    }
}