import java.util.ArrayList;

/**
 * @Author 李Muzi
 * @Date 2025/2/21 17:38
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int time[] = {60,60,60};
        int i = new Solution().numPairsDivisibleBy60(time);
        System.out.println(i);
    }
}

class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < time.length; i++) {
            if(list.contains(60 - (time[i] % 60))) {
                count++;
            }
            list.add(time[i] % 60);
        }
        return count;
    }
}