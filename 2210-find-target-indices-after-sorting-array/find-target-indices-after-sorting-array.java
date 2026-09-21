class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> arr = new ArrayList<>();
        int count = 0,targ = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < target) {
                count++;
            } else if (nums[i] == target) {
                targ++;
            }
        }
        for (int i = 1; i <= targ; i++) {
            arr.add(count);
            count++;
        }
        return arr;
    }
}