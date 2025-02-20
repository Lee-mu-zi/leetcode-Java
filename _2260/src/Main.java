import java.util.ArrayDeque;

/**
 * @Author 李Muzi
 * @Date 2025/2/20 14:06
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int cards[] = {3, 4, 2, 3, 4, 7};
        int i = new Solution().minimumCardPickup(cards);
        System.out.println(i);
    }
}

class Solution {
    public int minimumCardPickup(int[] cards) {
        int res = Integer.MAX_VALUE;
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < cards.length - 1; i++) {
            while (!stack.isEmpty() && stack.peek() == cards[i]){
                res = Math.min(res, stack.size() + 1);
                stack.pop();
            }
            stack.push(cards[i]);
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}