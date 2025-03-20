import java.util.Arrays;

/**
 * @Author 李Muzi
 * @Date 2025/3/13 9:27
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int[][] items = {{1,2},{3,2},{2,4},{5,6},{3,5}};
        int[] queries = {1,2,3,4,5,6};
        int[] ints = new Solution().maximumBeauty(items, queries);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}

class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        Arrays.sort(items, (a, b) -> a[0] - b[0]);
        for (int i = 1; i < items.length; i++) {
            items[i][0] = Math.max(items[i - 1][0], items[i][1]);
        }
        for (int i = 0; i < queries.length; i++) {
            int j = upperBound(items, queries[i]);
            queries[i] = j >= 0 ? items[j][1] : 0;
        }
        return queries;
    }

    private int upperBound(int[][] items, int target) {
        int left = -1;
        int right = items.length; // 开区间 (left, right)
        while (left + 1 < right) { // 区间不为空
            // 循环不变量：
            // items[left][0] <= target
            // items[right][0] > target
            int mid = (left + right) >>> 1;
            if (items[mid][0] > target) {
                right = mid; // 范围缩小到 (left, mid)
            } else {
                left = mid; // 范围缩小到 (mid, right)
            }
        }
        return right;
    }


}