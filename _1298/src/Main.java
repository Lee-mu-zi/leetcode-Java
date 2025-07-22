import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] status = {1, 0, 0, 0};
        int[] candies = {1, 2, 3, 4};
        int[][] keys = {{1, 2}, {3}, {}, {}};
        int[][] containedBoxes = {{2}, {3}, {1}, {}};
        int[] initialBoxes = {0};
        int i = new Solution().maxCandies(status, candies, keys, containedBoxes, initialBoxes);
        System.out.println(i);
    }
}

class Solution {
    public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
        if (initialBoxes.length == 0) return 0;
        ArrayList<Integer> list = new ArrayList<>();
        //判断初始拥有的盒子
        getAllBoxs(initialBoxes, containedBoxes, list);
        //根据盒子中的钥匙 将关闭的箱子打开
        for (int i = 0; i < list.size(); i++) {
            Integer index = list.get(i);
            for (int key : keys[index]) {
                status[key] = 1;
            }
        }
        //根据状态获取candies
        int ans = 0;
        for (int i = 0; i < candies.length; i++) {
            if (status[i] == 1 && list.contains(i)) {
                ans += candies[i];
            }
        }
        return ans;
    }

    private ArrayList<Integer> getAllBoxs(int[] initialBoxes, int[][] containedBoxes, ArrayList<Integer> list) {
        for (int initialBox : initialBoxes) {
            list.add(initialBox);
            //获取盒子中的盒子
            for (int containedBox : containedBoxes[initialBox]) {
                list.add(containedBox);
            }

        }
        return list;
    }
}