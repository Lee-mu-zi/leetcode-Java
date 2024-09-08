import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "aabb";
        int i = solution.firstUniqChar(s);
        System.out.println(i);
    }
}

class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hashMap = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            hashMap.put(s.charAt(i), hashMap.getOrDefault(s.charAt(i), 0) + 1 );
        }
        Set<Map.Entry<Character, Integer>> entries = hashMap.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            if (entry.getValue() == 1){
                return s.indexOf(entry.getKey().toString());
            }
        }
        return -1;
    }
}