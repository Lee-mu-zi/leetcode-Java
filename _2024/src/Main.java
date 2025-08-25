public class Main {
    public static void main(String[] args) {
        int i = new Solution().maxConsecutiveAnswers("FFFTTFTTFT", 3);
        System.out.println(i);
    }
}

class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int maxLen = 0;
        int left = 0;
        // 0表示T，1表示F
        int[] nums = new int[2];
        char[] charArray = answerKey.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'T') {
                nums[0]++;
            } else {
                nums[1]++;
            }
            while (nums[0] > k && nums[1] > k) {
                if (charArray[left] == 'T') {
                    nums[0]--;
                } else {
                    nums[1]--;
                }
                left++;
            }

            maxLen = Math.max(maxLen, i - left + 1);
        }
        return maxLen;
    }
}