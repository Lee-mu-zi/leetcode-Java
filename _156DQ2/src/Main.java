import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s = "abc";
        int k = 2;
        int i = new Solution().minDeletion(s, k);
        System.out.println(i);
    }
}

class Solution {
    public int minDeletion(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        int res = 0;
        for (char c : arr) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        if(map.size() > k ) {
            ArrayList<Integer> list = new ArrayList<>();
            Set<Map.Entry<Character, Integer>> entries = map.entrySet();
            entries.forEach(entry -> {list.add(entry.getValue());});
            Collections.sort(list);
            for (int i = 0; i < list.size() - k; i++) {
                res += list.get(i);
            }
        }
        return res;
    }
}