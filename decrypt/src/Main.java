import java.util.Arrays;

/**
 * @Author 李Muzi
 * @Date 2024/11/16 16:45
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int code[] = {2,4,9,3}, k = -2;
        int[] decrypt = new Solution().decrypt(code, k);
        Arrays.stream(decrypt).forEach(d -> System.out.print(d + " "));
    }
}

class Solution {
    public int[] decrypt(int[] code, int k) {
        int len = code.length;
        if(k == 0) {
            Arrays.fill(code, 0);
            return code;
        }
        int[] nums = new int[len * 2];
        for (int i = 0; i < code.length; i++) {
            nums[i + len] = nums[i] = code[i];
        }
        if(k > 0) {
            for (int i = 0; i < code.length; i++) {
                int sum = 0;
                for (int j = 0, temp = i + 1; j < k; j++, temp++) {
                    sum += nums[temp];
                }
                code[i] = sum;
            }
        } else {
            for (int i = len; i < nums.length; i++) {
                int sum = 0;
                for (int j = 0; j < -k; j++) {
                    int temp = i - j - 1;
                    sum += nums[temp];
                }
                code[i - len] = sum;
            }
        }

        return code;
    }
}
