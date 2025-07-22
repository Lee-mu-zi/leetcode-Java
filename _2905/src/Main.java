public class Main {
    public static void main(String[] args) {
        int nums[] = {5,1,4,1}, indexDifference = 2, valueDifference = 4;
        int[] indices = new Solution().findIndices(nums, indexDifference, valueDifference);
        for (int index : indices) {
            System.out.println(index);
        }
    }
}

class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int[] ans = new int[]{-1, -1};
        int len = nums.length;
        for (int i = 0; i < len - indexDifference; i++) {
            for (int j = i + indexDifference; j < len; j++) {
                if(Math.abs(i - j) >= indexDifference && Math.abs(nums[i] - nums[j]) >= valueDifference) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }
}

