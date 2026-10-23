class Solution {
    public int reverse(int n) {
        int reverse=0;
         while(n != 0){
            int j = n%10;
            n=n/10;
            if(reverse > Integer.MAX_VALUE/10 || reverse < Integer.MIN_VALUE/10)
                return 0;

            reverse = reverse*10+j;
        }
        return (int)reverse;
    }
}