/**
 * @Author 李Muzi
 * @Date 2024/12/22 9:52
 * @Description
 */
public class Main {
    public static void main(String[] args) {
//        int[][] events = {{1,2},{2,5},{3,9},{2,15}};
//        int[][] events = {{10,5},{1, 7}};
        int[][] events = {{12, 2}, {8, 3}, {18, 5}, {4, 6}, {3, 7}, {1, 9}, {2, 17}, {18, 20}};
        int i = new Solution().buttonWithLongestTime(events);
        System.out.println(i);
    }
}

class Solution {
    public int buttonWithLongestTime(int[][] events) {
        int max = events[0][0];
        int maxTime = events[0][1];
        for (int i = 1; i < events.length; i++) {
            int tempTime = events[i][1] - events[i - 1][1];
            if (tempTime > maxTime) {
                max = events[i][0];
                maxTime = tempTime;
            }
            else if (tempTime == maxTime) max = Math.min(max, events[i][0]);
        }
        return max;
    }
}