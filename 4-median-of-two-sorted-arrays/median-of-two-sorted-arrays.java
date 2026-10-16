class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] brr) {
        int[] arr=new int[arr1.length+brr.length];
        for(int i=0;i<arr1.length;i++){
            arr[i]=arr1[i];
        }
        for(int i=0;i<brr.length;i++){
            arr[arr1.length+i]=brr[i];
        }
        Arrays.sort(arr);
        int n=arr.length;
        if(n%2==0){
          return(arr[n/2-1]+arr[n/2])/2.0;
        }
        else{
          return arr[n/2];
        }
    }
}