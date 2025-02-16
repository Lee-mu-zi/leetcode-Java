import java.util.HashMap;

/**
 * @Author 李Muzi
 * @Date 2025/2/16 21:29
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int fruits[] = {1,2,3,2,2};
        int i = new Solution().totalFruit(fruits);
        System.out.println(i);
    }
}

class Solution {
    public int totalFruit(int[] fruits) {
        int ans = 0;
        int left = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int right = 0; right < fruits.length; right++) {
            map.merge(fruits[right], 1, Integer::sum);
            // 如果当前长度大于2,将左侧的水果吐出 直到等于2
            while (map.size() > 2) {
                //获取当前左侧水果 并将数量减去1
                int fruit = fruits[left];
                map.merge(fruit, -1, Integer::sum);
                if(map.get(fruit) == 0) {
                    map.remove(fruit);
                }

                left++;
            }
            // 如果当前没有出现第三种水果,统计下当前长度
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}