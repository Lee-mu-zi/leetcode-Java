import java.util.Arrays;

/**
 * @Author 李Muzi
 * @Date 2025/2/18 21:08
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int spells[] = {3,1,2}, potions[] = {8,5,8}, success = 16;
        int[] ints = new Solution().successfulPairs(spells, potions, success);
        for (int anInt : ints) {
            System.out.println(anInt);
        }

    }
}

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        for (int i = 0; i < spells.length; i++) {
            long target = success/ spells[i];
            if(target < potions[potions.length - 1]){
                spells[i] = potions.length - upperBound(target, potions);
            } else {
                spells[i] = 0;
            }
        }
        return spells;
    }

    private int upperBound(long target, int[] potions) {
        int left = -1, right = potions.length;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (potions[mid] > target) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return right;
    }
}