/**
 * @Author 李Muzi
 * @Date 2025/2/13 21:56
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int cardPoints[] = {1,2,3,4,5,6,1}, k = 3;
        int i = new Solution().maxScore(cardPoints, k);
        System.out.println(i);
    }
}

class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0;
        int left = 0, right = cardPoints.length - 1;
        while (left < right && k != 0) {
            if (cardPoints[left] < cardPoints[right]) {
                sum += cardPoints[right];
                right--;
                k--;
            } else {
                sum += cardPoints[left];
                left++;
                k--;
            }
        }
        return sum;
    }
}