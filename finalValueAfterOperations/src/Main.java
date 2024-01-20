import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] operations = {"--X","--X"};
        int ans = solution.finalValueAfterOperations(operations);
        System.out.println(ans);
    }
}

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        for (String operation : operations) {
            if(operation.equals("++X") || operation.equals("X++")){
                ans++;
            } else {
                ans--;
            }
        }
        return ans;
    }
}