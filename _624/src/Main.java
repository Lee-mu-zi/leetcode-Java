import java.util.ArrayList;
import java.util.List;

/**
 * @Author 李Muzi
 * @Date 2025/2/20 10:44
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int nums[][] = {{1}, {2}};
        List<List<Integer>> arrays = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        arrays.add(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(0);
        list2.add(5);
        arrays.add(list2);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
//        arrays.add(list3);

        int i = new Solution().maxDistance(arrays);
        System.out.println(i);
    }
}

class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int ans = 0;
        int mn = Integer.MAX_VALUE / 2; // 防止减法溢出
        int mx = Integer.MIN_VALUE / 2;
        for (List<Integer> a : arrays) {
            int x = a.get(0);
            int y = a.get(a.size() - 1);
            ans = Math.max(ans, Math.max(y - mn, mx - x));
            mn = Math.min(mn, x);
            mx = Math.max(mx, y);
        }
        return ans;
    }
}











