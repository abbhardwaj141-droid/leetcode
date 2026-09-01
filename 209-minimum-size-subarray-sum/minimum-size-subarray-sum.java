class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int i = 0,  j = 0, sum = 0;
        int min = Integer.MAX_VALUE;
        while(j<n){
            sum = sum + nums[j];
            while(sum >= target){
                min = Integer.min(min , j-i+1);
                sum = sum - nums[i];
                i++;
            }
            j++;
        }
        if(min == Integer.MAX_VALUE){
            return 0;
        }
        else{
            return min;
        }
    }
}