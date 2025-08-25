/**
 * @Author 李Muzi
 * @Date 2024/10/29 16:11
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int customers[] = {1,0,1,2,1,1,7,5}, grumpy[] = {0,1,0,1,0,1,0,1}, minutes = 3;
        int i = new Solution().maxSatisfied(customers, grumpy, minutes);
        System.out.println(i);
    }
}

class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int sum = 0;
        for (int i = 0; i < grumpy.length; i++) {
            if(grumpy[i] == 0) sum += customers[i];
        }
        int s1 = 0;
        int maxS1 = 0;
        for (int i = 0; i < grumpy.length; i++) {
            if(grumpy[i] == 1) s1 += customers[i];
            if(i < minutes) continue;
            maxS1 = Math.max(s1, maxS1);
            // 更改s1
            if(grumpy[i - minutes + 1] == 1) s1 -= customers[i - minutes + 1];
        }
        return sum + maxS1;
    }
}