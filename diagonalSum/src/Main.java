/**
 * @Author 李Muzi
 * @Date 2025/1/21 22:27
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int i = new Solution().diagonalSum(mat);
        System.out.println(i);
    }
}

class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = getSum(mat);
        if(mat.length % 2 != 0) sum -= mat[mat.length /2][mat.length / 2];
        return sum;
    }

    public int getSum(int[][] mat) {
        int sum = 0;
        int length = mat.length;
        for (int i = 0; i < length; i++) {
            sum += mat[i][i] + mat[length - i - 1][i];
        }
        return sum;
    }
}