class Solution {
    public int arraySign(int[] nums) {

        int sum = 1;

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] == 0) {
                sum = 0;
                break;
            }
            else if(nums[i] > 0) {
                sum = sum * 1;
            }
            else {
                sum = sum * -1;
            }
        }

        if(sum > 0)
            return 1;
        else if(sum < 0)
            return -1;
        else
            return 0;
    }
}