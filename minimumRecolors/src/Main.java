/**
 * @Author 李Muzi
 * @Date 2024/10/28 17:58
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        String blocks = "WBWBBBW";
        int k = 2;
        int i = new Solution().minimumRecolors(blocks, k);
        System.out.println(i);
    }
}

class Solution {
    public int minimumRecolors(String blocks, int k) {
        int res = Integer.MAX_VALUE;
        for (int i = 0; i <= blocks.length() - k; i++) {
            String sub = blocks.substring(i, i + k);
            int temp = 0;
            for (int j = 0; j < sub.length(); j++) {
                if(sub.charAt(j) == 'W') {
                    temp++;
                }
            }
            res = temp < res ? temp : res;
        }
        return res;
    }
}