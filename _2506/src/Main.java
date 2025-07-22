import java.util.HashMap;
import java.util.Map;

/**
 * @Author 李Muzi
 * @Date 2025/2/21 20:04
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        String words[] = {"dcedceadceceaeddcedc","dddcebcedcdbaeaaaeab","eecbeddbddeadcbbbdbb","decbcbebbddceacdeadd","ccbddbaedcadedbcaaae","dddcaadaceaedcdceedd","bbeddbcbbccddcaceeea","bdabacbbdadabbbddaea"};
        int i = new Solution().similarPairs(words);
        System.out.println(i);
    }
}

class Solution {
    public int similarPairs(String[] words) {
        Map<Integer, Integer> cnt = new HashMap<>();
        int ans = 0;
        for (String s : words) {
            int mask = 0; // 初始化一个空的集合
            for (char c : s.toCharArray()) {
                mask |= 1 << (c - 'a'); // 把 c 加到集合中
            }
            int c = cnt.getOrDefault(mask, 0);
            ans += c;
            cnt.put(mask, c + 1);
        }
        return ans;
    }
}