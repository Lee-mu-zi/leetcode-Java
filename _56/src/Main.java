import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> res = new ArrayList<>();
        for (int[] nums : intervals) {
            int m = res.size();
            if (m > 0 && nums[0] <= res.get(m - 1)[1]) {
                res.get(m - 1)[1] = Math.max(res.get(m - 1)[1], nums[1]);
            } else {
                res.add(nums);
            }

        }
        return res.toArray(new int[res.size()][]);
    }
}