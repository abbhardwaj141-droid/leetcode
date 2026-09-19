class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int sum = 0, sum2 = 0;

        for (int i = 0; i < nums1.length; i++) {
            sum = sum + nums1[i];
            sum2 = sum2 + nums2[i];
        }
        
        int total = sum2 - sum;
        return total / nums1.length;
    }
}