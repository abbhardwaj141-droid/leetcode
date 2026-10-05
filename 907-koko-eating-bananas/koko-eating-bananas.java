class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > max) {
                max = piles[i];
            }
        }
        int low = 1;
        int high = max;
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int hours = totalhours(piles, mid);
            if (hours <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int totalhours(int[] piles, int mid) {
        int ghante = 0;
        for (int i = 0; i < piles.length; i++) {
            ghante += Math.ceil(((double) piles[i]) / mid);
        }
        return ghante;
    }
}