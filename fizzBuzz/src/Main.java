import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 3;
        List<String> strings = solution.fizzBuzz(n);
        for (String string : strings) {
            System.out.println(string);
        }
    }
}

class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> strs = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if(i % 3 == 0 & i % 5 == 0) {
                strs.add("FizzBuzz");
            }
            else if(i % 3 == 0) {
                strs.add("Fizz");
            }
            else if(i % 5 == 0) {
                strs.add("Buzz");
            }
            else {
                strs.add(String.valueOf(i));
            }
        }
        return strs;
    }
}