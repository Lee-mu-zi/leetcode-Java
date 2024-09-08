public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] s = {'h','e','l','l','o'};
        solution.reverseString(s);
    }
}

class Solution {
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}