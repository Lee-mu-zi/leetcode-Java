import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s = "aeiaeia";
        int i = new Solution().maxFreqSum(s);
        System.out.println(i);
    }
}

class Solution {
    public int maxFreqSum(String s) {
        char[] array = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : array) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int maxVowel = 0;
        int maxFrequency = 0;
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            if(isVowel(entry.getKey()) ) {
                maxVowel = Math.max(maxVowel, entry.getValue());
            } else {
                maxFrequency = Math.max(maxFrequency, entry.getValue());
            }
        }
        return maxFrequency + maxVowel;
    }

    private boolean isVowel(Character key) {
        if(key == 'a' || key == 'e' || key == 'i' || key == 'o' || key == 'u') return true;
        return false;
    }
}