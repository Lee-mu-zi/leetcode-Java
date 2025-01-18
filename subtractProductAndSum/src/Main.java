import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int n = 234;
        Solution solution = new Solution();
        int i = solution.subtractProductAndSum(n);
        System.out.println(i);
    }
}

class Solution {
    public int subtractProductAndSum(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        while (n > 0) {
            list.add(n % 10);
            n /= 10;
        }
        int sum = 0;
        int multiplications = 1;
        for (Integer i : list) {
            sum += i;
            multiplications *= i;
        }
        return multiplications - sum;
    }
}