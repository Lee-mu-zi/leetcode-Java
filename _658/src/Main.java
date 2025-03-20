import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author 李Muzi
 * @Date 2025/3/15 15:33
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5}, k = 4, x = 3;
        List<Integer> list = new Solution().findClosestElements(arr, x, k);
        list.forEach(System.out::println);
    }
}

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int len = arr.length;
        int left = 0;
        int right = k;
        for (int i = k; i < len; i++) {
            if(Math.abs(arr[i] - x) < Math.abs(arr[left] - x)) {
                right = i + 1;
                left = right - k;
            }
        }
        return Arrays.stream(Arrays.copyOfRange(arr, left, right)).boxed().collect(Collectors.toList());
    }
}