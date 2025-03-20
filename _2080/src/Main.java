/**
 * @Author 李Muzi
 * @Date 2025/3/17 19:38
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int[] ints = new int[]{12, 33, 4, 56, 22, 2, 34, 33, 22, 12, 34, 56};
        RangeFreqQuery rangeFreqQuery = new RangeFreqQuery(ints);
        rangeFreqQuery.query(1, 2, 4); // 返回 1 。4 在子数组 [33, 4] 中出现 1 次。
        rangeFreqQuery.query(0, 11, 33); // 返回 2 。33 在整个子数组中出现 2 次。
    }
}

