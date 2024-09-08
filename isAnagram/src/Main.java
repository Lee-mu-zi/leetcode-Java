import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean anagram = solution.isAnagram("anagram", "nagaram");
        System.out.println(anagram);
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            hashMap.put(s.charAt(i), hashMap.getOrDefault(s.charAt(i), 0) + 1);
        }
        Set<Map.Entry<Character, Integer>> entries = hashMap.entrySet();
        for (int i = 0; i < t.length(); i++) {
            if(hashMap.containsKey(t.charAt(i))){
                int num = hashMap.get(t.charAt(i));
                if(num == 0) {
                    return false;
                }
                num--;
                hashMap.put(t.charAt(i),num);
            }
        }
        for (Map.Entry<Character, Integer> entry : entries) {
            if(entry.getValue() > 0 ) {
                return false;
            }
        }
        return true;
    }
}