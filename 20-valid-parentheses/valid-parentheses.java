class Solution {
    public boolean isValid(String s) {

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                str.append(ch);
            } 
            else {

                if (str.length() == 0)
                    return false;

                char last = str.charAt(str.length() - 1);

                if ((ch == ')' && last != '(') ||
                    (ch == ']' && last != '[') ||
                    (ch == '}' && last != '{')) {
                    return false;
                }

                str.deleteCharAt(str.length() - 1);
            }
        }

        return str.length() == 0;
    }
}