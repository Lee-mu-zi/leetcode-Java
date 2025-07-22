public class Main {
    public static void main(String[] args) {
        String[] words = {"aba", "bcb", "ece", "aa", "e"};
        int[][] queries = {{0, 2}, {1, 4}, {1, 1}};
        int[] ints = new Solution().vowelStrings(words, queries);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}

class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] s = new int[n + 1];
        int len = queries.length;
        int[] res = new int[len];
        for (int i = 0; i < n; i++) {
            // 判断字符串首位是否都是元音字符
            int value = isVowelString(words[i])? 1 : 0;
            // 记录到当前位置，其中符合条件的所有字符串的个数。
            s[i + 1] = s[i] + value;
        }

        for (int i = 0; i < len; i++) {
            res[i] = s[queries[i][1] + 1] - s[queries[i][0]];
        }
        return res;
    }

    public boolean isVowelString(String word) {
        return isVowelLetter(word.charAt(0)) && isVowelLetter(word.charAt(word.length() - 1));
    }

    public boolean isVowelLetter(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

}

