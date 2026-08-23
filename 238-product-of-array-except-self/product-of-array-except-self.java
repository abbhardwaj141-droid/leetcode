class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int pre = 1;
        arr[0] = 1;
        for(int i=1; i<nums.length;i++){
            arr[i] = nums[i-1] * pre;
            pre = arr[i];
        }
        pre = 1;
        for(int i=nums.length-1; i>=0;i--){
            arr[i] = arr[i] * pre;
            pre *= nums[i];
        }
        return arr;
    }
}