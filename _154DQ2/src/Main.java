public class Main {
    public static void main(String[] args) {
        int  x = 2, y = 7, z = 4;
        int i = new Solution().findClosest(x, y, z);
        System.out.println(i);
    }
}

class Solution {
    public int findClosest(int x, int y, int z) {
        int first = Math.abs(x - z);
        int second = Math.abs(y - z);
        if(first > second) return 2;
        else if(first < second) return 1;
        else return 0;
    }
}