class Solution {
    public int firstUniqueEven(int[] nums) {
        for(int i=0; i<nums.length; i++ ){
            int count = 0;
            for(int j=0; j<nums.length; j++){
                if(nums[i] == nums[j] && nums[i] % 2==0){
                    count ++;
                }
            }
            if(count == 1){
                return nums[i];
            }
        }
        return -1;
    }
}