public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        System.out.println(s);
    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s0 = strs[0];
        for (int i = 0; i < s0.length(); i++) {
            char c = s0.charAt(i);
            for (String str : strs) {
                if(str.length() == i || str.charAt(i) != c) {
                    return str.substring(0, i);
                }
            }
        }
        return s0;
    }
}