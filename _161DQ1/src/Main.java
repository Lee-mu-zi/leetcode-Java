public class Main {
    public static void main(String[] args) {
        int nums[] = {175868717,841457609,-948571070,-747264172};
        long l = new Solution().splitArray(nums);
        System.out.println(l);
    }
}

class Solution {
    public long splitArray(int[] nums) {
        long sumA = 0;
        long sumB = 0;
        for (int i = 0; i < nums.length; i++) {
            if(isPrime(i)) {
                sumA += nums[i];
            } else {
                sumB += nums[i];
            }
        }
        return Math.abs(sumA - sumB);
    }

    public boolean isPrime(int n) {
        if(n <= 1) return false;
        for (int i = 2; i < n / i; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}