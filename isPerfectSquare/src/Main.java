/**
 * @Author 李Muzi
 * @Date 2024/12/18 22:41
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        boolean perfectSquare = new Solution().isPerfectSquare(16);
        System.out.println(perfectSquare);
    }
}

class Solution {
    public boolean isPerfectSquare(int num) {
        int left = 0;
        int right = num;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = mid * mid;
            if (square > num) {
                right = mid - 1;
            } else if (square < num) {
                left = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}