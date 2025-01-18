import java.util.ArrayList;

/**
 * @Author 李Muzi
 * @Date 2024/12/22 20:59
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        String strs[] = {"4","D","D","C","D"};
        int i = new Solution().calPoints(strs);
        System.out.println(i);
    }
}

class Solution {
    public int calPoints(String[] operations) {
        if (operations.length == 1) return Integer.parseInt(operations[0]);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < operations.length - 1; i++) {
            switch (operations[i]) {
                case "C":
                    break;
                case "D":
                    list.add(list.get(list.size() - 1) * 2);
                    break;
                case "+":
                    list.add(list.get(list.size() - 1) + list.get(list.size() - 2));
                    break;
                default:
                    if (operations[i + 1].equals("C")) break;
                    list.add(Integer.parseInt(operations[i]));
            }
        }
        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        if (operations[operations.length - 1].equals("C")) return sum;
        else if (operations[operations.length - 1].equals("D")) sum += list.get(list.size() - 1) * 2;
        else if (operations[operations.length - 1].equals("+"))
            sum += list.get(list.size() - 1) + list.get(list.size() - 2);
        else sum += Integer.parseInt(operations[operations.length - 1]);
        return sum;
    }
}