import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int ratings[] = {1, 0, 2};
        int candy = new Solution().candy(ratings);
        System.out.println(candy);
    }
}

class Solution {
    public int candy(int[] ratings) {
        int len = ratings.length;
        int[] left = new int[len];
        int[] right = new int[len];
        Arrays.fill(left, 1);
        Arrays.fill(right, 1);
        // 左规则
        for (int i = 1; i < len; i++) {
            if (ratings[i] > ratings[i - 1]) {
                left[i] = left[i - 1] + 1;
            }
        }
        // 经过左规则之后，最后一位已经确定，可以直接统计
        int count = left[len - 1];
        for (int i = len - 2; i >= 0; i--) {
            if(ratings[i] > ratings[i + 1]) {
                right[i] = right[i + 1] + 1;
            }
            // 获取left和right当前位置的最大值，因为只有最大的才能同时符合两个规则的要求
            count += Math.max(left[i], right[i]);
        }
        return count;
    }
}