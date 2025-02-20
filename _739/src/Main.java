import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Author 李Muzi
 * @Date 2025/2/19 22:57
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int temperatures[] = {73,74,75,71,69,72,76,73};
        new Solution().dailyTemperatures(temperatures);

    }
}

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Deque<Integer> st = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            int t = temperatures[i];
            while (!st.isEmpty() && t > temperatures[st.peek()]) {
                int j = st.pop();
                ans[j] = i - j;
            }
            st.push(i);
        }
        return ans;
    }
}