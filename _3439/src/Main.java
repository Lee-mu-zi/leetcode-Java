public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        int len = startTime.length;
        for (int i = 1; i < len; i++) {
            int temp = startTime[i] - endTime[i - 1];
            startTime[i] = endTime[i - 1];
            endTime[i] = endTime[i] - temp;
        }
        return eventTime - endTime[len - 1] + startTime[0];
    }
}
