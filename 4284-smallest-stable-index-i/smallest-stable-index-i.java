class Solution {
    public int firstStableIndex(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {

            int Max = Integer.MIN_VALUE;
            int Min = Integer.MAX_VALUE;

            for (int j = 0; j <= i; j++) {
                Max = Math.max(Max, nums[j]);
            }

            for (int j = i; j < nums.length; j++) {
                Min = Math.min(Min, nums[j]);
            }

            if (Max - Min <= k) {
                return i;
            }
        }
        return -1;
    }
}