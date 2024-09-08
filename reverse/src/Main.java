public class Main {
    public static void main(String[] args) {
        int x = 1534236469;
        Solution solution = new Solution();
        int reverse = solution.reverse(x);
        System.out.println(reverse);
    }
}

class Solution {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            if (rev < Integer.MIN_VALUE / 10 || rev > Integer.MAX_VALUE / 10) {
                return 0;
            }
            int digit = x % 10;
            x /= 10;
            rev = rev * 10 + digit;
        }
        return rev;
    }
}