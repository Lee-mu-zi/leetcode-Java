class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int result = 0;
        for (int i = 0; i < words.length; i++) {
            String string = new StringBuffer(words[i]).reverse().toString();
            for (int j = i + 1; j < words.length; j++) {
                if(string.equals(words[j])){
                    result++;
                }
            }
        }
        return result;
    }
}