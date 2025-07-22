public class Main {
    public static void main(String[] args) {
        String s = "zaza";
        int i = new Solution().reverseDegree(s);
        System.out.println(i);
    }
}

class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += ('z' - s.charAt(i) + 1) * (i + 1) ;
        }
        return sum;
    }
}
