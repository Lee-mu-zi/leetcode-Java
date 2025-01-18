import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @Author 李Muzi
 * @Date 2024/11/29 22:37
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        String strs[] = {"eat", "tea", "tan", "ate", "nat", "bat" };
        List<List<String>> lists = new Solution().groupAnagrams(strs);
        for (List<String> list : lists) {
            list.forEach(System.out::println);
            System.out.println(" ");
            System.out.println("----------------------------------");
            System.out.println(" ");
        }
    }
}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            map.computeIfAbsent(new String(arr), k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }
}