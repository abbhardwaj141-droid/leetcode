class Solution {
    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public int maxVowels(String s, int k) {
        int left = 0, right = 0, count = 0;
        int Max = Integer.MIN_VALUE;
        while (right < s.length()) {
            if (isVowel(s.charAt(right))) {
                count++;
            }
            if (right - left + 1 == k) {
                Max = Math.max(Max, count);
                if (isVowel(s.charAt(left))) {
                    count--;
                }
                left++;
            }
            right++;
        }
        return Max;
    }
}