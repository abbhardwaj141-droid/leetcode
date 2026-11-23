class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch != '*'){
                st.push(ch);
            }
            else{
                 st.pop();
            }
        }
        char[] c = new char[st.size()];
        int i = c.length-1;
        while(st.size()!=0){
            c[i] = st.pop();
            i--;
        }
        return new String(c);
    }
}