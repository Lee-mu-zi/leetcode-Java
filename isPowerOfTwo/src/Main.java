public class Main {
    public static void main(String[] args) {
        boolean powerOfTwo = new Solution().isPowerOfTwo(1);
        System.out.println(powerOfTwo);
    }
}

class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0)
            return false;
        while (n % 2 == 0) n /= 2;
        return n == 1;
    }
}