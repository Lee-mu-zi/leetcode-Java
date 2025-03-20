/**
 * @Author 李Muzi
 * @Date 2025/3/1 22:36
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int[] original = {1,2,3,4};
        int[][] bounds = {{1,2},{2,3},{3,4},{4,5}};
        int i = new Solution().countArrays(original, bounds);
        System.out.println(i);
    }
}

class Solution {
    public int countArrays(int[] original, int[][] bounds) {
        return 1;
    }
}