class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0, multi = 1, m = n;
        while(m>0){
            int temp = m%10;
            m=m/10;
            sum = sum + temp;
            multi = multi * temp;
        }
        if(n % (sum+multi) == 0){
            return true;
        }
        return false;
    }
}