public class Main {
    public static void main(String[] args) {
        int nums[] = {1,3,5,6};
        int target = 2;
        int value = searchInsert(nums,target);
        System.out.println(value);
    }

    private static int searchInsert(int[] nums, int target) {
        int ans = nums.length;

        // 定义target在左闭右闭的区间，[left, right]
        int left = 0;
        int right = ans - 1;

        while (left <= right) { // 当low==right，区间[left, right]依然有效
            int mid = left + (right - left) / 2; // 防止溢出
            if (nums[mid] > target) {
                right = mid - 1; // target 在左区间，所以[left, mid - 1]
            } else if (nums[mid] < target) {
                left = mid + 1; // target 在右区间，所以[mid + 1, right]
            } else {
                // 1. 目标值等于数组中某一个元素  return mid;
                return mid;
            }
        }
        // 2.目标值在数组所有元素之前 3.目标值插入数组中 4.目标值在数组所有元素之后 return right + 1;
        return right + 1;
    }

}