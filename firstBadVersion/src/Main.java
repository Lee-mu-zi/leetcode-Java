/**
 * @Author 李Muzi
 * @Date 2024/12/14 22:46
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int n = 5;
        int i = new Solution().firstBadVersion(n);
        System.out.println(i);
    }
}

class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1, right = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if(isBadVersion(mid)) left = mid - 1;
            else right = mid + 1;
        }
        return left;
    }
}

class VersionControl {
    public boolean isBadVersion(int version){
        return false;
    };
}