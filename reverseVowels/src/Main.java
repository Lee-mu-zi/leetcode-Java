public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "leetcode";
        String str = solution.reverseVowels(s);
        System.out.println(str);
    }
}

class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        char[] chars = s.toCharArray();
        int i = 0, j = n - 1;
        while (i < j) {
            while (i < j && !isVowel(chars[i])) {
                i++;
            }
            while (i < j && !isVowel(chars[j])) {
                j--;
            }
            if (i < j) {
                swap(chars, i, j);
                i++;
                j--;
            }
        }
        return new String(chars);
    }

    public boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) >= 0;
    }

    public void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}