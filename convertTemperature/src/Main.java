public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.convertTemperature(36.50);
    }
}

class Solution {
    public double[] convertTemperature(double celsius) {
        double nums[] = {celsius + 273.15, celsius * 1.80 + 32.00};
        return nums;
    }
}