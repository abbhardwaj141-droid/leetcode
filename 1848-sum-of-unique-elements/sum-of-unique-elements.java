class Solution {
    public int sumOfUnique(int[] nums) {
        int[] fre = new int[101];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            fre[nums[i]]++;
        }
        for (int i = 0; i < fre.length; i++) {
            if (fre[i] == 1) {
                sum += i;
            }
        }
        return sum;
    }
}