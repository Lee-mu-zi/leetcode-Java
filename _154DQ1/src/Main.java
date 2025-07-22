public class Main {
    public static void main(String[] args) {
        int nums[] = {4,1,3}, k = 4;
        int i = new Solution().minOperations(nums, k);
        System.out.println(i);
    }
}

class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum % k;
    }
}