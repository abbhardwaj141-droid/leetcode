class Solution {
    public int smallestIndex(int[] num) {
        for(int i=0; i<num.length; i++){
            int sum = 0;
            while (num[i]!=0){
                int p=num[i] % 10;
                num[i] = num[i] / 10;
                sum = sum+p;
            }
            if(sum == i){
                return i;
            }
        }
        return -1;
    }
}