import java.util.*;

class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);

        double ans = Double.MAX_VALUE;

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            double avg = (nums[left] + nums[right]) / 2.0;
            ans = Math.min(ans, avg);

            left++;
            right--;
        }

        return ans;
    }
}