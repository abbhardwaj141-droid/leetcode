class Solution {
    public boolean areOccurrencesEqual(String s) {

        char[] freq = new char[26];
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }
        
        boolean flag = true;
        char count = 'z';
        for(int i = 0; i < freq.length; i++){
            if(freq[i] > 0 && flag == true){
                count = freq[i];
                flag = false;
            }
            if(freq[i] > 0 && freq[i] != count){
                return false;
            }
        }
        return true;
    }
}