class Solution {
    public int[] intersect(int[] num1, int[] num2) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num2.length; j++) {
                if (num1[i] == num2[j]) {
                    list.add(num1[i]);
                    num2[j] = -1;
                    break;
                }
            }
        }

        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}