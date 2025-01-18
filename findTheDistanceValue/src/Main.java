/**
 * @Author 李Muzi
 * @Date 2024/12/8 21:35
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1,4,2,3};
        int[] arr2 = {-4,-3,6,10,20,30};
        int d = 2;
        int i = new Solution().findTheDistanceValue(arr1, arr2, d);
        System.out.println(i);
    }
}

class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int len = 0;
        for (int i : arr1) {
            boolean ok = true;
            for (int j : arr2) {
                ok &= Math.abs(i - j) > d;
            }
            len += ok ? 1 : 0;
        }
        return len;
    }
}