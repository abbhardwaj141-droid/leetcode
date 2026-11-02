class Solution {
    public int minMoves2(int[] nums) {

        Arrays.sort(nums);
        int mid = nums.length/2;
        int sum =0;
        
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > nums[mid])
                sum += nums[i] - nums[mid];
            else
                sum += nums[mid] - nums[i];
        }
        return sum;
    }
}