public class Main {
    public static void main(String[] args) {
        boolean b = new Solution().checkDivisibility(23);
        System.out.println(b);
    }
}

class Solution {
    public boolean checkDivisibility(int n) {
        long sum = 0;
        long mul = 1;
        int temp = n;
        while (n > 0) {
            int i = n % 10;
            sum += i;
            mul *= i;
            n /= 10;
        }
        if(temp % (sum + mul) == 0 ) return true;
        return false;
    }
}