public class Main {
    public static void main(String[] args) {
        boolean valid = new Solution().isValid("aabcbc");
        System.out.println(valid);
    }
}

class Solution {
    public boolean isValid(String s) {
        while (s.contains("abc")) {
            s = s.replace("abc", "");
        }
        return s.equals("") ;
    }
}

