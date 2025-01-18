/**
 * @Author 李Muzi
 * @Date 2024/10/29 16:11
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int customers[] = {4,10,10}, grumpy[] = {1,1,0}, minutes = 2;
        int i = new Solution().maxSatisfied(customers, grumpy, minutes);
        System.out.println(i);
    }
}

class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        //获取在minutes范围中最多个顾客数量
        int max = 0;
        int index = 0;
        for (int i = 0; i <= customers.length - minutes; i++) {
            int temp = 0;
            for (int j = i; j < i + minutes; j++) {
                temp += customers[j];
            }
            if( temp > max) {
                max = temp;
                index = i;
            }
        }
        for (int i = 0; i < customers.length; i++) {
            if( (i < index || i > index + minutes - 1) && grumpy[i] == 0 ) {
                max += customers[i];
            }
        }
        return max;
    }
}