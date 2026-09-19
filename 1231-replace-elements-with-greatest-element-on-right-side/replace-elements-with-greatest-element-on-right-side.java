class Solution {
    public int[] replaceElements(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int max = Integer.MIN_VALUE;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]>max){
                    max = nums[j];
                }
            }
             if(max != Integer.MIN_VALUE){
                    arr[i]=max;
                }
            else{
                arr[i] = -1;
            }
        }
        return arr;
    }
}