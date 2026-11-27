class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if(st1.size() >0 && ch == '#')st1.pop();
            else if(ch != '#')st1.push(ch);
        }
        for(int i=0; i<t.length();i++){
            char ch = t.charAt(i);
            if(st2.size() >0 && ch == '#')st2.pop();
            else if(ch != '#') st2.push(ch);
        }
        return(st1.equals(st2));
    }
}