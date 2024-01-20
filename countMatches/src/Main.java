import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String ruleKey = "color", ruleValue = "silver";
        ArrayList<String> str1 = new ArrayList<>();
        str1.add("phone");
        str1.add("blue");
        str1.add("pixel");
        ArrayList<String> str2 = new ArrayList<>();
        str2.add("computer");
        str2.add("silver");
        str2.add("lenovo");
        ArrayList<String> str3 = new ArrayList<>();
        str3.add("phone");
        str3.add("gold");
        str3.add("iphone");
        List<List<String>> items = new ArrayList<>();
        items.add(str1);
        items.add(str2);
        items.add(str3);
        int ans = solution.countMatches(items,ruleKey,ruleValue);
        System.out.println(ans);
    }
}

class Solution {
    public int getAns(int index,List<List<String>> items,String ruleValue){
        int ans = 0;
        for (int i = 0; i < items.size(); i++) {
            String s = items.get(i).get(index);
            if(s.equals(ruleValue)){
                ans++;
            }
        }
        return ans;
    }
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans = 0;
        switch (ruleKey){
            case "type":
                ans = getAns(0,items,ruleValue);
                break;
            case "color":
                ans = getAns(1,items,ruleValue);
                break;
            case "name":
                ans = getAns(2,items,ruleValue);
                break;
        }
        return ans;
    }
}