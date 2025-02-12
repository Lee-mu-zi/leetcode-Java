import java.util.HashMap;
import java.util.Map;

/**
 * @Author 李Muzi
 * @Date 2025/1/21 22:43
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int[][] rectangles = {{4,8},{3,6},{10,20},{15,30}};
//        int[][] rectangles = {{4, 5}, {7, 8}};
        long l = new Solution().interchangeableRectangles(rectangles);
        System.out.println(l);
    }
}

class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        Map<Long, Long> map = new HashMap<>();
        long res = 0;
        for (int[] arr : rectangles) {
            int gcd = gcd(arr[0], arr[1]);
            long temp = arr[0] / gcd + arr[1] / gcd;
            res += map.getOrDefault(temp, 0L);
            map.put(temp, map.getOrDefault(temp, 0L) + 1);
        }
        return res;
    }

    int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}