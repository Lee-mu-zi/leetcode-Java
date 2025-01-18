public class Main {
    public static void main(String[] args) {
        String words[] = {"hey","aeo","mu","ooo","artro"};
        int left = 1, right = 4;
        int i = new Solution().vowelStrings(words, left, right);
        System.out.println(i);
    }
}

class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int res = 0;
        for (int i = left; i <= right; i++) {
            if(words[i].charAt(0) == 'a' || words[i].charAt(0) == 'e' || words[i].charAt(0) == 'i' || words[i].charAt(0) == 'o' || words[i].charAt(0) == 'u') {
                if(words[i].charAt(words[i].length() - 1) == 'a' || words[i].charAt(words[i].length() - 1) == 'e' || words[i].charAt(words[i].length() - 1) == 'i' || words[i].charAt(words[i].length() - 1) == 'o' || words[i].charAt(words[i].length() - 1) == 'u') {
                    res++;
                }
            }
        }
        return res;
    }
}