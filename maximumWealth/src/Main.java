public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] accounts = {{1,5},{7,3},{3,5}};
        solution.maximumWealth(accounts);
    }
}

class Solution {
    public int maximumWealth(int[][] accounts) {
        int length = accounts.length;
        int max = 0;
        for (int i = 0; i < length; i++) {
            int res = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                res += accounts[i][j];
            }
            if (res > max) {
                max = res;
            }
        }
        return max;
    }
}