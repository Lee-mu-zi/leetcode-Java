import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

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
        int count = 0;
        Set<Set<Integer>> set = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            Set<Integer> collect = Arrays.stream(words[i].chars().toArray()).boxed().collect(Collectors.toSet());
            if(!set.add(collect)) count++;
        }
        return set.size() == 1 ? count + 1 : count;
    }
}