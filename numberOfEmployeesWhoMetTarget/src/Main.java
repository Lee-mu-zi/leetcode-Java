public class Main {
    public static void main(String[] args) {
        int[] hours = {5,1,4,2,2};
        int target = 6;
        Solution solution = new Solution();
        int i = solution.numberOfEmployeesWhoMetTarget(hours,target);
        System.out.println(i);
    }
}

class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int ans = 0;
        for (int hour : hours) {
            if(hour >= target) {
                ans++;
            }
        }
        return ans;
    }
}