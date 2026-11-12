class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int count = 1;
        int scount = 1;
        int max = 1;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] < nums[i+1]){
                count++;
            }
            else{
                count = 1;
            }
            max = Math.max(max, count);
        }
        for(int i = nums.length - 1; i > 0; i--){
            if(nums[i] < nums[i-1]){
                scount++;
            }
            else{
                scount = 1;
            }
            max = Math.max(max, scount);
        }
        return max;
    }
}