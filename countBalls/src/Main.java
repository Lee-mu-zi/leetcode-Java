import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author 李Muzi
 * @Date 2025/2/13 21:22
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int lowLimit = 1, highLimit = 10;
        int i = new Solution().countBalls(lowLimit, highLimit);
//        System.out.println(i);
    }
}

class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = lowLimit,j = 1; i <= highLimit; i++) {
            int sum = getSum(i);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            max = Math.max(max, entry.getValue());
        }
        return max;
    }

    public int getSum(int num) {
        int sum = 0;
        int i = 0;
        while (num != 0) {
            i = num % 10;
            sum += i;
            num = num / 10;
        }
        return sum;
    }
}