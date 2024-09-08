public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "Hello World";
        solution.lengthOfLastWord(s);
    }
}

class Solution {
    public int lengthOfLastWord(String s) {
        String[] strs = s.split(" ");
        int max = 0;
        for (String str : strs) {
            int len = str.length();
            max = Math.max(0, len);
        }
        return max;
    }
}