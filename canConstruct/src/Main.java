public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String ransomNote = "aa", magazine = "aab";
        boolean b = solution.canConstruct(ransomNote, magazine);
//        System.out.println(b);
    }
}

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        int[] cnt = new int[26];
        for (char c : magazine.toCharArray()) {
            cnt[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            cnt[c - 'a']--;
            if(cnt[c - 'a'] < 0) {
                return false;
            }
        }
        return true;

    }
}