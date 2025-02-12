import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @Author 李Muzi
 * @Date 2025/2/11 20:50
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        Integer arr[] = {996021492,996021492,973489433,66259330,554129007,713784351,646092981,328987029,469368828,685679486,66259330,165954500,731567840,595800464,552439059,14673238,157622945,521321042,386913607,733723177,330475939,462727944,69696035,958945846,648914457,627088742,363551051,50748590,400980660,674779765,439950964,613843311,385212079,725525766,813504429,385212079,66563232,578031878,935017574,554725813,456892672,245308625,626768145,270964388,554725813,768296675,676923124,939689721,115905765,625193590,717796816,27972217,277242430,768296675,480860474,659230631,570682291,601689140,955632265,767424000,251696645,675750691,767424000,251696645,767424000,675750691,675750691,251696645};
        ArrayList<Integer> nums = new ArrayList<>(arr.length);
        Collections.addAll(nums, arr);
        int m = 8, k = 8;
        long l = new Solution().maxSum(nums, m, k);
//        System.out.println(l);
    }
}

class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {
        long max = 0L;
        //获取长度为k的全部子数组
        for (int i = 0; i <= nums.size() - k; i++) {
            List<Integer> subList = nums.subList(i, k + i);
            //判断当前list是否为几乎唯一子数组 几乎唯一子数组的标志为有至少m个不同元素
            Set<Integer> set = subList.stream().collect(Collectors.toSet());
            if(set.size() >= m) {
                //获取唯一子数组的最大值
                System.out.println("第" + i + "组    " + subList.stream().mapToInt(a -> a).sum());
//                max = Math.max(max, subList.stream().mapToInt(a -> a).sum());
            }

        }
        return max;
    }
}