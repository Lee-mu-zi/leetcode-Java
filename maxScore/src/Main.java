public class Main {
    public static void main(String[] args) {
        String s = "011101";
        int i = new Solution().maxScore(s);
        System.out.println(i);
    }
}

class Solution {
    public int maxScore(String s) {
        int max = 0;
        for (int i = 1; i < s.length(); i++) {
            String leftStr = s.substring(0, i);
            String rightStr = s.substring(i);
            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j < leftStr.length(); j++) {
                if(leftStr.charAt(j) == '0') leftSum++;
            }
            for (int j = 0; j < rightStr.length(); j++) {
                if(rightStr.charAt(j) == '1') rightSum++;
            }
            max = Math.max(max, leftSum + rightSum);
        }
        return max;
    }
}