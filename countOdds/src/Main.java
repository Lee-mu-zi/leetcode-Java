public class Main {
    public static void main(String[] args) {
        int low = 8, high = 10;
        int i = new Solution().countOdds(low,high);
        System.out.println(i);
    }
}

class Solution {
    public int countOdds(int low, int high) {
        if(low % 2 == 1 && high % 2 == 1) {
            return (high - low + 1) / 2 + 1;
        }
        return (high - low + 1) / 2;
    }
}