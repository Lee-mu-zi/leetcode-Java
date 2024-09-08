public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String haystack = "leetcode", needle = "leeto";
        int i = solution.strStr(haystack, needle);
        System.out.println(i);
    }
}

class Solution {
    public int strStr(String haystack, String needle) {
        int length = needle.length();
        for (int i = 0 ; i < haystack.length() - length + 1; i++) {
            String sub = haystack.substring(i, length + i);
            if( sub.equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}