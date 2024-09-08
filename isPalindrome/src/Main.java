public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "A man, a plan, a canal: Panama";
        boolean palindrome = solution.isPalindrome(s);
        System.out.println(palindrome);
    }
}

class Solution {
    public boolean isPalindrome(String s) {

        String lowerCase = s.toLowerCase();
        String regex = "[^a-zA-Z0-9]";
        String s1 = lowerCase.replaceAll(regex, "");

        int begin = 0;
        int end = s1.length() - 1;

        while (begin <= end) {
            if(s1.charAt(begin) == s1.charAt(end)){
                begin++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }
}