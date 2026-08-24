class Solution {
    public int reverseDegree(String s) {
        int sum =0;
        int k = 1;
        for(int i=0; i<s.length(); i++){
           int count= (27 - (s.charAt(i) - 'a' + 1))*k;
           sum +=count;
           k++;
        }
        return sum;
    }
}