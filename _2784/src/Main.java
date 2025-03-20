/**
 * @Author 李Muzi
 * @Date 2025/2/24 10:36
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int nums[] = {11,21,12};
        int i = new Solution().countBeautifulPairs(nums);
        System.out.println(i);
    }
}

class Solution {
    public int countBeautifulPairs(int[] nums) {
        int res = 0, n = nums.length;
        for (int i = 0; i < n; i++) {
            while (nums[i] >= 10) {
                nums[i] /= 10;
            }
            for (int j = i + 1; j < n; j++) {
                if (gcd(nums[i], nums[j] % 10) == 1) {
                    res++;
                }
            }
        }
        return res;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}