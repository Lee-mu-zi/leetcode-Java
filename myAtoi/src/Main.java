public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.myAtoi("  ");
        System.out.println(i);

    }
}

class Solution {
    public int myAtoi(String s) {
        String str = s.replace(" ", "");
        if (str == null || str.length() == 0) return 0;
        if (str.charAt(0) < '+' || str.charAt(0) > '9' || str.charAt(0) == ',' || str.charAt(0) == '.' || str.charAt(0) == '/') {
            return 0;
        }
        int temp = 1;
        if (str.charAt(0) == '+') {
            str = str.substring(1);
        } else if (str.charAt(0) == '-') {
            str = str.substring(1);
            temp = -1;
        }
        int i = 0;
        long res = 0;
        for (; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                break;
            }
        }
        String sub = str.substring(0, i);

        if (sub.length() != 0) {
            res = Long.parseLong(sub);
        }
        res = res * temp;
        if(res > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (res < Integer.MIN_VALUE) return Integer.MIN_VALUE;

        return (int)res ;
    }
}