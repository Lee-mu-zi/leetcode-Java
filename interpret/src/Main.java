import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String command = "(al)G(al)()()G";
        String interpret = solution.interpret(command);
        System.out.println(interpret);
    }
}

class Solution {
    public String interpret(String command) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                res.append("G");
            } else if (command.charAt(i) == '(') {
                if (command.charAt(i + 1) == ')') {
                    res.append("o");
                } else {
                    res.append("al");
                }
            }
        }
        return res.toString();
    }
}