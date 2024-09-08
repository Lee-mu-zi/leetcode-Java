public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] height = {1,8,6,2,5,4,8,3,7};
        int i = solution.maxArea(height);
        System.out.println(i);
    }
}

class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int max = 0;
        while (left < right) {
            max = Math.max(max, Math.min(height[left], height[right]) * (right - left));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }

}