class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int maxCount = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int count = 1;
                int x = num;
                
                while (set.contains(x + 1)) {
                    x++;
                    count++;
                }
                maxCount = Math.max(maxCount, count);
            }
        }
        return maxCount;
    }
}