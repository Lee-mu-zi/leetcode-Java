import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {2,3,2}, nums2 = {1,2};
        Solution solution = new Solution();
        int[] intersectionValues = solution.findIntersectionValues(nums1, nums2);
        for (int intersectionValue : intersectionValues) {
            System.out.println(intersectionValue);
        }
    }
}

class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        // 保持长度较短的数组在为nums2
        if(nums1.length < nums2.length) {
            return findIntersectionValues(nums2, nums1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : nums1) {
            for (int j : nums2) {
                if(i == j) {
                    list.add(i);
                }
            }

        }
        int[] ints = new int[list.size()];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = list.get(i);
        }
        return ints;
    }

}