class Solution {
    public int[] intersect(int[] num1, int[] num2) {

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < num1.length; i++) {
            map.put(num1[i], map.getOrDefault(num1[i], 0) + 1);
        }
        for (int i = 0; i < num2.length; i++) {
            if (map.containsKey(num2[i]) && map.get(num2[i]) > 0) {
                list.add(num2[i]);
                map.put(num2[i], map.get(num2[i]) - 1);
            }
        }

        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}