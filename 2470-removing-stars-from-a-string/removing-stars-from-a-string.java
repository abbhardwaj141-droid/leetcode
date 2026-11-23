class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        String str ="";
        for(int i=0; i<s.length(); i++){
            int n = str.length();
            char ch = s.charAt(i);
            if(ch != '*'){
                st.push(ch);
                str = str + ch;
            }
            else{
                 st.pop();
                 str = str.substring(0,n-1);
            }
        }
        return str;
    }
}