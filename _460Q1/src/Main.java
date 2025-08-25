import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        long l = new Solution().numOfSubsequences("LCTKLCLT");
        System.out.println(l);
    }
}

class Solution {
    public long numOfSubsequences(String s) {
        char[] charArray = s.toCharArray();
        long nums[] = new long[3];
        for (char c : charArray) {
            if (c == 'L') {
                nums[0] += 1;
            } else if (c == 'C') {
                nums[1] += 1;
            } else if (c == 'T') {
                nums[2] += 1;
            }
        }
        Arrays.sort(nums);
        return (nums[0] + 1) * nums[1] * nums[2];
    }
}