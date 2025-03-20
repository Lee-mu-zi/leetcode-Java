import java.util.TreeSet;

/**
 * @Author 李Muzi
 * @Date 2025/3/15 22:17
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int digits[] = {1, 2, 3, 4};
        int i = new Solution().totalNumbers(digits);
        System.out.println(i);
    }
}

class Solution {
    public int totalNumbers(int[] digits) {
        TreeSet<Integer> set = new TreeSet<>();
        int n = digits.length;
        for (int i = 0; i < n; i++) {
            if (digits[i] == 0) continue;
            for (int j = 0; j < n; j++) {
                if (j == i) continue;
                for (int k = 0; k < n; k++) {
                    if (k == i || k == j || digits[k] % 2 != 0) continue;
                    set.add(digits[i] * 100 + digits[j] * 10 + digits[k]);
                }
            }
        }
        for (Integer i : set) {
            System.out.println(i);
        }
        int size = set.size();
        return size;
    }
}

