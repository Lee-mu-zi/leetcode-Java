import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Character> set = new HashSet<>();
        String words[] = {"dcedceadceceaeddcedc", "dddcebcedcdbaeaaaeab", "eecbeddbddeadcbbbdbb", "decbcbebbddceacdeadd", "ccbddbaedcadedbcaaae", "dddcaadaceaedcdceedd", "bbeddbcbbccddcaceeea", "bdabacbbdadabbbddaea"};
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                char c = words[i].charAt(j);
                set.add(c);
            }
            System.out.println("第" + i + "个Set数组是:  " + set);
        }

    }
}