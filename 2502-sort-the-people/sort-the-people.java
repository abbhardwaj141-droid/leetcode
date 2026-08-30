class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String[] arr = new String[heights.length];
        for (int i = 0; i < names.length; i++) {
            int max = Integer.MIN_VALUE;
            int k = 0;
            for (int j = 0; j < heights.length; j++) {
                if (max < heights[j]) {
                    max = heights[j];
                    k = j;
                }
            }
            arr[i] = names[k];
            heights[k] = Integer.MIN_VALUE;
        }
        return arr;
    }
}