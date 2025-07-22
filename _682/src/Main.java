import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] strs = {"5","2","C","D","+"};
        int i = new Solution().calPoints(strs);
        System.out.println(i);
    }
}

class Solution {
    public int calPoints(String[] operations) {
        List<Integer> st = new ArrayList<>();
        for (String op : operations) {
            switch (op.charAt(0)) {
                case '+':
                    st.add(st.get(st.size() - 2) + st.get(st.size() - 1));
                    break;
                case 'D':
                    st.add(st.get(st.size() - 1) * 2);
                    break;
                case 'C':
                    st.remove(st.size() - 1);
                    break;
                default:
                    st.add(Integer.parseInt(op));
            }
        }
        int sum = 0;
        for (int x : st) {
            sum += x;
        }
        return sum;
    }
}