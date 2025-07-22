import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = new Solution().smallestPalindrome("daccad");
        System.out.println(s);
    }
}

class Solution {
    public String smallestPalindrome(String s) {
        String sub = s.substring(0, s.length() / 2);
        char[] arr = sub.toCharArray();
        char temp = 0;
        Arrays.sort(arr);
        StringBuilder builder = new StringBuilder();
        for (char c : arr) {
            builder.append(c);
        }
        String leftSub = builder.toString();
        StringBuilder rightSub = builder.reverse();
        if(s.length() % 2 == 1) {
            return leftSub + s.charAt(s.length() / 2) + rightSub;
        } else {
            return leftSub + rightSub;
        }
    }
}