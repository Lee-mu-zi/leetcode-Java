import java.util.HashMap;

/**
 * @Author 李Muzi
 * @Date 2025/2/15 22:18
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        int arr[] = {1,2,3,3};
        int specialInteger = new Solution().findSpecialInteger(arr);
        System.out.println(specialInteger);
    }
}

class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i : arr) {
            hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
            Integer j = hashMap.get(i);
            if(j > arr.length * 0.25) return i;
        }
        return 0;
    }
}