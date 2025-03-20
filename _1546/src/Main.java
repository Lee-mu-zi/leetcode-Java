import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author 李Muzi
 * @Date 2025/3/18 9:53
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int nums[] = {2,6,7,3,1,7};
        int m = 3, k = 4;
        List<Integer> collect = Arrays.stream(nums).boxed().collect(Collectors.toList());
        long l = new Solution().maxSum(collect, m, k);
        System.out.println(l);
    }
}

//class Solution {
//    public long maxSum(List<Integer> nums, int m, int k) {
//        long max = 0L;
//        //获取长度为k的全部子数组
//        for (int i = 0; i <= nums.size() - k; i++) {
//            List<Integer> subList = nums.subList(i, k + i);
//            //判断当前list是否为几乎唯一子数组 几乎唯一子数组的标志为有至少m个不同元素
//            Set<Integer> set = new HashSet<>(subList);
//            if(set.size() >= m) {
//                //获取唯一子数组的最大值
//                long sum = subList.stream().mapToLong(a -> a).sum();
//                max = Math.max(max, sum);
//            }
//        }
//        return max;
//    }
//}

class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {
        long max = 0L;
        long sum = 0L;
        Integer[] array = nums.toArray(Integer[]::new);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k - 1; i++) {
            map.put(nums.get(i), map.getOrDefault(nums.get(i), 0) + 1);
            sum += nums.get(i);
        }
        for (int i = k - 1; i < nums.size(); i++) {
            sum += nums.get(i);
            map.put(nums.get(i), map.getOrDefault(nums.get(i), 0) + 1);
            if(map.size() >= m) {
                max = Math.max(max, sum);
            }
            // 如果当前不是几乎唯一数组 窗口向右移动
            int out = nums.get(i - k + 1);
            sum -= out;
            map.put(out,map.get(out) - 1);
            if(map.get(out) == 0) map.remove(out);
        }
        return max;
    }
}

//class Solution {
//    public long maxSum(List<Integer> nums, int m, int k) {
//        Integer[] a = nums.toArray(Integer[]::new);
//        long ans = 0; // 注意元素相加会超过 int，要用 long
//        long sum = 0;
//        Map<Integer, Integer> cnt = new HashMap<>();
//
//        for (int i = 0; i < k - 1; i++) { // 先统计 k-1 个数
//            sum += a[i];
//            cnt.merge(a[i], 1, Integer::sum); // cnt[a[i]]++
//        }
//
//        for (int i = k - 1; i < nums.size(); i++) {
//            sum += a[i]; // 再添加一个数就是 k 个数了
//            cnt.merge(a[i], 1, Integer::sum); // cnt[a[i]]++
//            if (cnt.size() >= m) {
//                ans = Math.max(ans, sum);
//            }
//
//            int out = a[i - k + 1];
//            sum -= out; // 下一个子数组不包含 out，移出窗口
//            if (cnt.merge(out, -1, Integer::sum) == 0) { // --cnt[out] == 0
//                cnt.remove(out);
//            }
//
//
//        }
//
//        return ans;
//    }
//}
//
//
//
