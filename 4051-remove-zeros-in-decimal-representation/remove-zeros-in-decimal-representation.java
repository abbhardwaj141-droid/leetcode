class Solution {
    public long removeZeros(long n) {
        long place = 1;
        long sum = 0;
        while(n!=0){
            long temp = n % 10;
            n = n / 10;

            if (temp != 0) {
              sum = temp * place + sum;
              place *= 10;
            }
        }
        return sum;
    }
}