public class Main {
    public static void main(String[] args) {
        boolean powerOfThree = new Solution().isPowerOfThree(45);
        System.out.println(powerOfThree);
    }
}

class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        while (n % 3 == 0) n /= 3;
        return n == 1;
    }
}