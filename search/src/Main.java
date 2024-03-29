import java.util.*;

public class Main {
    public static void main(String[] args) {
        int nums[] = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int search = search(nums, target);
        System.out.println(search);
    }

    public static int search(int[] nums, int target) {
        if((target < nums[0]) || (target >nums[nums.length - 1])){
            return -1;
        }
        int left = 0;
        int right = nums.length -1;
        while (left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] < target){
                left = mid + 1;
            } else if(nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] == target){
                return mid;
            }
        }
        return -1;
    }
}


