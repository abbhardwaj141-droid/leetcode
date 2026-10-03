class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int[] array = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            int left = i+1;          
            int right= n-i;
            int total= left*right;  
            int oddCount=(total+1)/2; 
            array[i] =arr[i]*oddCount;   
        }
        for(int i=0;i<n;i++){
            sum += array[i];
        }
        return sum;
    }
}