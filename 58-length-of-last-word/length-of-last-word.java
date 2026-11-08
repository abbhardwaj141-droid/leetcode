class Solution {
    public int lengthOfLastWord(String str) {
        str=str.toUpperCase();
        int count =0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                count ++;
            }
            if(str.charAt(i)==' ' && count>0){
                return count;
            }
        }
        return count;
    }
}