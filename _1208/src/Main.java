public class Main {
    public static void main(String[] args) {
        String s = "abcd", t = "cdef";
        int maxCost = 3;
        int i = new Solution().equalSubstring(s, t, maxCost);
        System.out.println(i);
    }
}

class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int maxLen = 0;
        int left = 0;
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();
        int sum = 0;
        for (int i = 0; i < tCharArray.length; i++) {
            sum += Math.abs(sCharArray[i] - tCharArray[i]);
            while (sum > maxCost) {
                sum -= Math.abs(sCharArray[left] - tCharArray[left]);
                left++;
            }
            maxLen = Math.max(maxLen, i - left + 1);
        }

        return maxLen;
    }
}