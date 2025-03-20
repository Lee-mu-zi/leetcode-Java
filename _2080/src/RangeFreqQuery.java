import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class RangeFreqQuery {

    private final HashMap<Integer, List<Integer>> map = new HashMap<>();

    public RangeFreqQuery(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            map.computeIfAbsent(arr[i], k -> new ArrayList<>()).add(i);
        }
    }

    public int query(int left, int right, int value) {
        // 获取目标value位置集合
        List<Integer> list = map.get(value);
        if (list == null) return 0;
        int i = lowerBound(list, right + 1);
        int i1 = lowerBound(list, left);
        return i- i1;
    }

    private int lowerBound(List<Integer> list, int target) {
        int left = -1;
        int right = list.size();
        while (left + 1 < right) { // 区间不为空
            int mid = (left + right) >>> 1;
            if (list.get(mid) < target) {
                left = mid; // 范围缩小到 (mid, right)
            } else {
                right = mid; // 范围缩小到 (left, mid)
            }
        }
        return right;

    }
}
