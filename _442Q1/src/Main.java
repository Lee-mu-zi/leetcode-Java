/**
 * @Author 李Muzi
 * @Date 2025/3/23 10:17
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int n = 2, w = 3, maxWeight = 15;
        int i = new Solution().maxContainers(n, w, maxWeight);
        System.out.println(i);
    }
}

class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int maxContainers = n * n;

        int k = Math.min(maxContainers, maxWeight / w);

        return k;
    }
}