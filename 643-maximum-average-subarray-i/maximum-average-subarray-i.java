class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0,j = 0,sum = 0;
        int max = Integer.MIN_VALUE;

        while (j < nums.length) {
            sum += nums[j];

            if (j - i + 1 == k) {
                max = Math.max(sum, max);
                sum -= nums[i];
                i++;
            }

            j++;
        }

        double avg = (double) max / k;
        return avg;
    }
}