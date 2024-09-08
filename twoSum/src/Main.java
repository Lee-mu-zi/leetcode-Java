public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {2,7,11,15};
        int target = 9;
        int[] ints = solution.twoSum(numbers, target);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                if(numbers[j] == complement) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }

        return new int[]{-1,-1};
    }
}