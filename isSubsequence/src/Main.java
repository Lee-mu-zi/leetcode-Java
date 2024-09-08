import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "axc", t = "ahbgdc";
        boolean subsequence = solution.isSubsequence(s, t);
        System.out.println(subsequence);
    }
}

class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length(), m = t.length();
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == n;
    }
}