class Solution {
    public int minMoves2(int[] nums) {

        Arrays.sort(nums);
        int sum = 0;
        int low = 0, high = nums.length - 1;
        int mid = low + (high - low) / 2;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > nums[mid])
                sum += nums[i] - nums[mid];
            else
                sum += nums[mid] - nums[i];
        }
        return sum;
    }
}