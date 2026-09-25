class Solution {
    public int buyChoco(int[] prices, int money) {
        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;
        int value = money;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                smin = min;
                min = prices[i];
            } else if (prices[i] < smin) {
                smin = prices[i];
            }
        }
        money -= (min + smin);
        if (money < 0) {
            return value;
        }
        return money;
    }
}