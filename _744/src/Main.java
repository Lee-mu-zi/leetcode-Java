/**
 * @Author 李Muzi
 * @Date 2025/3/20 11:53
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        char letters[] = {'c', 'f', 'j'};
        char target = 'a';
        char c = new Solution().nextGreatestLetter(letters, target);
        System.out.println(c);
    }
}

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int len = letters.length;
        int left = 0;
        int right = len - 1;
        while (left < right) {
            int mid = (left + right) >>> 1;
            if (target >= letters[mid]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return letters[left];
    }
}
