public class Main {
    public static void main(String[] args) {
        int num1 = 12, num2 = 5;
        Solution solution = new Solution();
        int sum = solution.sum(num1, num2);
        System.out.println(sum);
    }
}

class Solution {
    public int sum(int num1, int num2) {
        return num1 + num2;
    }
}