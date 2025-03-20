import java.util.Arrays;

/**
 * @Author 李Muzi
 * @Date 2025/3/11 10:25
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        String[] queries = {"bbb","cc"}, words = {"a","aa","aaa","aaaa"};
        int[] ints = new Solution().numSmallerByFrequency(queries, words);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}

class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int len = queries.length;
        int[] ans = new int[len];
        for (int i = 0; i < len; i++) {
            int minQue = getMin(queries[i]);
            for (int j = 0; j < words.length; j++) {
                int minWor = getMin(words[j]);
                if (minQue < minWor) {
                    ans[i]++;
                }
            }
        }
        return ans;
    }

    public int getMin(String str) {
        char[] array = str.toCharArray();
        Arrays.sort(array);
        int ans = 0;
        for (char c : array) {
            if (c == array[0]) ans++;
            else return ans;
        }
        return ans;
    }
}
