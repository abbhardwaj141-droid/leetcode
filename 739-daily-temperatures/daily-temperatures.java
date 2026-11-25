class Solution {
    public int[] dailyTemperatures(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < n; i++) {
            while(!st.empty() && nums[st.peek()] < nums[i]) {
                int pop = st.pop();
                ans[pop] = i - pop;
            }
            st.push(i);
        }
        return ans;
    }
}