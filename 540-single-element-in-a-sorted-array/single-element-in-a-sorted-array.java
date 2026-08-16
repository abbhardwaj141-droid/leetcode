class Solution {
    public int singleNonDuplicate(int[] arr) {
     int hi = arr.length-1, lo = 0;
        while(hi>lo){
            int mid = lo+(hi-lo)/2;
            if(mid % 2 ==1){
                mid--;
            }
            if(arr[mid] == arr[mid+1]){
                lo = mid+2;
            }
            else{
                hi = mid ;
            }
        }
      return arr[lo];
    }
}