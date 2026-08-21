class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int lift = 0;
        int ans = 0;
        for (int i = 0; i < requests.length; i++) {
            ans += Math.abs(requests[i] - lift);
            lift = requests[i];
        }
        return ans;
    }
}