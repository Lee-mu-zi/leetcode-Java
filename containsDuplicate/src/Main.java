import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,2,3,1};
        boolean b = solution.containsDuplicate(nums);
        System.out.println(b);
    }
}

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.stream(nums).forEach(
                num -> map.put(num,map.getOrDefault(num,0) + 1)
        );
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            Integer value = entry.getValue();
            if(value > 1){
                return true;
            }
        }
        return false;
    }
}