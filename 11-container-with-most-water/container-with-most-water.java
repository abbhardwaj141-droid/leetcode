class Solution {
    public int maxArea(int[] arr) {
           int i = 0 , j = arr.length -1 , max = 0;
           while(i<j){
            int height = Math.min(arr[i],arr[j]);
            int vol = height*(j-i);
            max = Math.max(max,vol);
            if(arr[i]<arr[j]) i++;
            else j--;
           }
           return max;
    }
}