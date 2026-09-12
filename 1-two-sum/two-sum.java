class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer, Integer> map = new HashMap<>();
      int arr[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i] , i);
        }
        for(int i = 0; i < nums.length; i++){
            int rem = target - nums[i];
            if(map.containsKey(rem) && map.get(rem) != i){
                arr[1] = map.get(rem);
                arr[0] = i;
                return arr;
            }
        }
        return arr;
    }
}