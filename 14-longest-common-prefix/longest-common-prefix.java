class Solution {
    public String longestCommonPrefix(String[] str) {
        String result = "";
        for (int i = 0; i < str[0].length(); i++) {
            char ch = str[0].charAt(i);
            for (int j = 1; j < str.length; j++) {
                if (i >= str[j].length() || ch != str[j].charAt(i)) {
                    return result;
                }
            }
            result += ch;
        }
        return result;
    }
}