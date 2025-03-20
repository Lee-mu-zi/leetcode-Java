/**
 * @Author 李Muzi
 * @Date 2025/3/20 11:08
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int weights[] = {1,2,3,4,5,6,7,8,9,10}, days = 5;
        int i = new Solution().shipWithinDays(weights, days);
        System.out.println(i);
    }
}

class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0, max = 0;
        for (int weight : weights) {
            max = Math.max(max, weight);
            sum += weight;
        }
        int left = max, right = sum;
        while (left < right) {
            int mid  = (left +right) >>> 1;
            if(check(mid, weights, days)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }

    private boolean check(int mid, int[] weights, int days) {
        int count = 1;
        int sum = 0;
        for (int i = 0; i < weights.length; i++) {
            sum += weights[i];
            while (sum > mid) {
                i--;
                count++;
                sum = 0;
            }
        }
        return count <= days;
    }
}