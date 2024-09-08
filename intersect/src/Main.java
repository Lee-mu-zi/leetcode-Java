import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {4,9,5}, nums2 = {9,4,9,8,4};
        int[] intersect = solution.intersect(nums1, nums2);
        for (int i = 0; i < intersect.length; i++) {
            System.out.println(intersect[i]);
        }
    }
}

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length)
            return intersect(nums2, nums1);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int[] intersection = new int[nums1.length];
        int index = 0;
        for (int num : nums2) {
            int count = map.getOrDefault(num, 0);
            if (count > 0) {
                intersection[index++] = num;
                count--;
                if(count > 0) {
                    map.put(num, count);
                } else {
                    map.remove(num);
                }
            }
        }
        return Arrays.copyOfRange(intersection, 0, index);
    }
}