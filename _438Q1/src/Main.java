import java.util.LinkedList;

/**
 * @Author 李Muzi
 * @Date 2025/2/23 10:30
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        // 废弃
        boolean b = new Solution().hasSameDigits("08442");

        System.out.println(b);
    }
}

class Solution {
    public boolean hasSameDigits(String s) {
        if(s.length() < 2) return false;
        int num = 0;
        while (s.length() > 2) {
            num = Integer.parseInt(s);
            LinkedList<Integer> list = new LinkedList<>();
            StringBuilder stringBuilder = new StringBuilder();
            if(s.charAt(0) == '0') stringBuilder.append(s.charAt(1));
            while (num > 0) {
                int i = num % 10;
                list.addFirst(i);
                num /= 10;
            }

            for (int i = 0; i < list.size() - 1; i++) {
                stringBuilder.append((list.get(i) + list.get(i + 1)) % 10);
            }
            s = stringBuilder.toString();
        }
        if(s.charAt(0) == s.charAt(1)) return true;

        return false;
    }
}