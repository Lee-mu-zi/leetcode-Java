public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        solution.merge(nums1, m, nums2, n);
    }
}


/**
 * 双指针
 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //创建两个指针 p1指向nums1 p2指向nums2
        int p1 = 0, p2 = 0;
        //创建一个新的数组存储合并后的数据，数组长度为 m + n
        int[] sorted = new int[m + n];
        //创建一个新的临时变量，存储所需的值
        int cur;
        while (p1 < m || p2 < n) {
            if (p1 == m) {
                cur = nums2[p2++];
            } else if (p2 == n) {
                cur = nums1[p1++];
            } else if (nums1[p1] < nums2[p2]) {
                cur = nums1[p1++];
            } else {
                cur = nums2[p2++];
            }
            sorted[p1 + p2 - 1] = cur;
        }
        //由于题目要求将数组存储在nums1中
        for (int i = 0; i != m + n; i++) {
            nums1[i] = sorted[i];
        }

    }
}