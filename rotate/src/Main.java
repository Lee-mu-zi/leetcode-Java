import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        solution.rotate(matrix);
    }
}

class Solution {
    public void rotate(int[][] matrix) {
        // 拷贝数组 保留原数组 做原地变化
        int[][] arr = Arrays.copyOf(matrix, matrix.length);
        // 循环获取每一个内部数组
        for (int i = arr.length - 1; i >= 0 ; i--) {
            // 定义一个临时一维数组暂存旋转后的数组
            int[] temps = new int[arr[i].length];
            int num = arr[i].length - 1;
            // 获取数组的第j个数组的第i位
            for (int j = 0; j < arr[i].length; j++) {
                temps[j] = arr[num][i];
                num--;
            }
            matrix[i] = temps;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }
}