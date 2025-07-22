public class Main {
    public static void main(String[] args) {
        String caption = "Leetcode daily streak achieved";
        String s = new Solution().generateTag(caption);
        System.out.println(s);
    }
}

class Solution {
    public String generateTag(String caption) {
        String[] s = caption.toLowerCase().split(" ");
        if(s.length == 0) return "#";
        StringBuilder sb = new StringBuilder();
        sb.append("#").append(s[0]);
        for (int i = 1; i < s.length; i++) {
            if(s[i].isEmpty()) continue;
            String replaced = s[i].replaceFirst(s[i].charAt(0) + "", (char)(s[i].charAt(0) - 32) + "");
            sb.append(replaced);
        }
        String string = sb.toString();
        if(string.length() > 100) string = string.substring(0, 100);
        if(string.charAt(1) >= 'A' && string.charAt(1) <= 'Z' ) {
            return string.replaceFirst(string.charAt(1) + "", (char)(string.charAt(1) + 32) + "");
        }
        return string;
    }
}