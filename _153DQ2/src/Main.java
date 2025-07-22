public class Main {
    public static void main(String[] args) {
        String s = "000";
        int i = new Solution().maxActiveSectionsAfterTrade(s);
        System.out.println(i);
    }
}

class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int res = 0;
        char[] arr = s.toCharArray();
        int length = arr.length;
        if(length <= 2) {
            for (char c : arr) {
                if(c == '1') {
                    res++;
                }
            }
            return res;
        }
        int[] ints = new int[2];
        int left = 0;
        int maxLen = 0;
        int begin = 0, end = 0;
        for (int right = 0; right < length; right++) {
            ints[arr[right] - '0']++;
            while (ints[1] > 1) {
                ints[arr[left] - '0']--;
                left++;
            }
            int temp = right - left + 1;
            if(temp > maxLen) {
                maxLen = temp;
                begin = left;
                end = right;
            }
        }
        if(ints[1] == 0) return 0;
        if (begin == 0 && end == length - 1) {
            return maxLen;
        } else if ( (begin == 0 && end != length - 1) || (begin != 0 && end == length - 1)) {
            return maxLen + 1;
        } else {
            return maxLen + 2;
        }
    }
}