class Solution {
    public int[] findErrorNums(int[] nums) {
        int sum = 0;
        int arr[] = new int[2];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            sum = sum + nums[i];
            if (nums[i] == nums[i + 1]) {
                arr[0] = nums[i];
            }
        }
        sum = sum + nums[nums.length - 1];
        int total = nums.length * (nums.length + 1) / 2;
        sum = sum - arr[0];
        arr[1] = total - sum;

        return arr;
    }
}