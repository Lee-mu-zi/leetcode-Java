public class Main {
    public static void main(String[] args) {
        String s = "abc", t = "def";
        int i = new Solution().longestPalindrome(s, t);
        System.out.println(i);
    }
}

class Solution {
    public int longestPalindrome(String s, String t) {
        int max = 1, sLen = s.length(), tLen = t.length();
        if(sLen > tLen) {
            longestPalindrome(t, s);
        }
        if (isPalindrome(s)) {
            max = sLen;
        }
        if (isPalindrome(t)) {
            max = Math.max(max, tLen);
        }
        for (int i = 0; i < sLen; i++) {
            for (int j = 1; j <= sLen; j++) {

            }
        }




        return max;
    }

    private boolean isPalindrome(String s) {
        int length = s.length();
        for (int i = 0; i < length / 2; i++) {
            if (s.charAt(i) != s.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

}