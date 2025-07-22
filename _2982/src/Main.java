import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String s = "ereerrrererrrererre";
        int i = new Solution().maximumLength(s);
        System.out.println(i);
    }
}

class Solution {
    public int maximumLength(String s) {
        int right = s.length();
        int left = 0;
        while (left + 1 < right) {
            int mid = (left + right) >>> 1;
            if(check(mid, s)) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return left == 0 ? -1 : left;
    }

    private boolean check(int mid, String s) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length() - mid + 1; i++) {
            String substring = s.substring(i, i + mid);
            hashMap.put(substring, hashMap.getOrDefault(substring, 0) + 1);
            if(hashMap.get(substring) >= 3) {
                HashSet<Character> characters = new HashSet<>();
                for (int j = 0; j < substring.length(); j++) {
                    characters.add(substring.charAt(j));
                }
                if(characters.size() == 1) {
                    return true;
                } else {
                    hashMap.put(substring, 0);
                }
            }
        }
        return false;
    }
}