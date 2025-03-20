/**
 * @Author 李Muzi
 * @Date 2025/3/4 15:49
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        String s = "100011001";
        int k = 3;
        String str = new Solution().shortestBeautifulSubstring(s, k);
        System.out.println(str);
    }
}

class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        // 替换掉字符0，如果剩下的字符1的总个数小于k，则该字符串永远不可能有美丽字符串
        if(s.replace("0", "").length() < k) return "";
        char[] chars = s.toCharArray();
        String ans = s;
        int count = 0, left = 0;
        for (int right = 0; right < chars.length; right++) {
            // 如果当前右指针指向的是字符1，则count + 1
            count += chars[right] - '0';
            while(count > k || chars[left] == '0') {
                // 如果当前左指针指向的是字符1，则count - 1
                count -= chars[left] - '0';
                //如果当前指向的是1，那么count减去1，减去之后如果指向的是0，但是由于我们要求最短的，所以可以直接排除掉。
                left++;
            }
            if(count == k) {
                String substring = s.substring(left, right + 1);
                if(ans.length() > substring.length() || substring.length() == ans.length() && substring.compareTo(ans) < 0) {
                    ans = substring;
                }
            }
        }
        return ans;
    }
}
