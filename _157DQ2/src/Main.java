public class Main {
    public static void main(String[] args) {
        String  word = "aadcbbbebb";
        int i = new Solution().maxSubstrings(word);
        System.out.println(i);
    }
}

class Solution {
    public int maxSubstrings(String word) {
        int ans = 0;
        char[] arr = word.toCharArray();
        int len = arr.length;
        int left = 0;
        for (int right = 1; right < len; right++) {

            if(arr[right] == arr[left] && right - left >= 3) {
                ans++;
                left = right + 1;
                right++;
            }
        }

        return ans;
    }
}
