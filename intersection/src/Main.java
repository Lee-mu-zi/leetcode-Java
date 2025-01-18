import java.util.Arrays;
import java.util.HashSet;

/**
 * @Author 李Muzi
 * @Date 2024/12/19 21:17
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1}, nums2 = {2,2};
        int[] ints = new Solution().intersection(nums1, nums2);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length) intersection(nums2, nums1);
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        HashSet<Integer> arr = new HashSet<>();
        int first = 0;
        int second = 0;

        while (first < nums1.length && second < nums2.length) {
            if(nums1[first] > nums2[second]) {
                second++;
            } else if(nums1[first] < nums2[second]) {
                first++;
            } else {
                arr.add(nums1[first]);
                first++;
                second++;
            }
        }
        return arr.stream().mapToInt(i -> i).toArray();

    }
}