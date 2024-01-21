import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int encoded[] = {1,2,3};
        int first = 1;
        int[] decode = solution.decode(encoded,first);
        for (int d : decode) {
            System.out.println(d);
        }
    }
}


class Solution {
    public int[] decode(int[] encoded, int first) {
        int n = encoded.length + 1;
        int[] arr = new int[n];
        arr[0] = first;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] ^ encoded[i - 1];
        }
        return arr;
    }
}
