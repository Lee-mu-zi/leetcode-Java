import java.util.Arrays;

/**
 * @Author 李Muzi
 * @Date 2024/12/9 22:22
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {4,5,2,1};
        int[] queries = {3,10,21};
        int[] ints = new Solution().answerQueries(nums, queries);
        Arrays.stream(ints).forEach(System.out::println);
    }
}

class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int ant = 0;
            int sum = 0;
            for (int num : nums) {
                sum += num;
                if(sum > queries[i]) {
                    break;
                }
                ant++;
            }
            res[i] = ant;
        }
        return res;
    }
}