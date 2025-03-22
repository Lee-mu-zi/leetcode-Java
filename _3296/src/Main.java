/**
 * @Author 李Muzi
 * @Date 2025/3/22 8:15
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int mountainHeight = 4, workerTimes[] = {2,1,1};
        long l = new Solution().minNumberOfSeconds(mountainHeight, workerTimes);
        System.out.println(l);
    }
}

class Solution {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        int max = 0, min = Integer.MAX_VALUE;
        for (int workerTime : workerTimes) {
            min = Math.min(min, workerTime);
            max = Math.max(max, workerTime);
        }
        long left = 0;
        long right = (long) max * mountainHeight * (mountainHeight + 1) / 2;
        while (left + 1 < right) {
            long mid = (left + right) >>> 1;
            if(check(mid, workerTimes, mountainHeight)) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return right;
    }

    private boolean check(long mid, int[] workerTimes, int mountainHeight) {
        int sum = 0;
        for (int i = 0; i < workerTimes.length; i++) {
            for (int j = 0; j <= i; j++) {
                sum += workerTimes[i] * (j + 1);
                if(sum >= mountainHeight) {
                    return true;
                }
            }
        }
        return false;
    }
}