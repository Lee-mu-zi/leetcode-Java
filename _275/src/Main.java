public class Main {
    public static void main(String[] args) {
        int citations[] = {0,1,3,5,6};
        int i = new Solution().hIndex(citations);
        System.out.println(i);
    }
}

class Solution {
    public int hIndex(int[] citations) {
        int left = 0;
        int length = citations.length;
        int right = length + 1;
        while (left + 1 < right) {
            int mid = (left + right) >>> 1;
            if(citations[length - mid] >= mid) {
                left = mid;
            }else {
                right = mid;
            }
        }
        return left;
    }
}