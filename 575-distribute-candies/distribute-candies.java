class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        for (int ele : candyType) {
            set.add(ele);
        }
        int maxCandy = candyType.length / 2;
        return Integer.min(set.size(), maxCandy);
    }
}