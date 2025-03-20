/**
 * @Author 李Muzi
 * @Date 2025/3/19 12:26
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int times[] = {9,3,10,5};
        int totalTrips = 2;
        long l = new Solution().minimumTime(times, totalTrips);
        System.out.println(l);
    }
}

class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        int minT = Integer.MAX_VALUE;
        int maxT = 0;
        for (int i : time) {
            minT = Math.min(minT, i);
            maxT = Math.max(maxT, i);
        }
        // totalTrips表示至少需要完成的旅程数量，平分到不同耗时的汽车上，并向上取整，确保每辆车至少完成一趟旅程。
        int avg = (totalTrips - 1) / time.length + 1;
        // 二分左侧赋值
        long left = (long) minT * avg - 1;
        // 二分右侧赋值
        long right = Math.min((long) maxT * avg, (long)minT * totalTrips);
        while (left + 1< right) {
            long mid = (left + right) >>> 1;
            if(check(time, mid, totalTrips)) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return right;
    }

    private boolean check(int[] time, long mid, int totalTrips) {
        long sum = 0;
        for (int i : time) {
            sum += mid / i;
            if(sum >= totalTrips) {
                return true;
            }
        }
        return false;
    }
}