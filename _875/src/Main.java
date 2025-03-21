/**
 * @Author 李Muzi
 * @Date 2025/3/21 10:01
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int piles[] = {805306368,805306368,805306368}, h = 1000000000;
        int i = new Solution().minEatingSpeed(piles, h);
        System.out.println(i);
    }
}

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 0;
        int right = 0;
        for (int p : piles) {
            right = Math.max(right, p);
        }
        while (left + 1 < right) { // 开区间不为空
            int mid = left + (right - left) / 2;
            if (check(mid, piles, h)) {
                right = mid; // 循环不变量：恒为 true
            } else {
                left = mid; // 循环不变量：恒为 false
            }
        }
        return right; // 最小的 true
    }

    private boolean check(int mid, int[] piles, int h) {
        int sum = piles.length;
        for (int pile : piles) {
            sum += (pile - 1) / mid;
            if (sum > h) {
                return false;
            }
        }
        return true;
    }
}