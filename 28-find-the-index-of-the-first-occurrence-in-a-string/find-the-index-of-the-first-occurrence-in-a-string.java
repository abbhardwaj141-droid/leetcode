class Solution {
    public int strStr(String haystack, String needle) {

        if(needle.length() == 0) return 0;

        int left = 0;
        int count = needle.length();
        int scnd = 0;

        while(left < haystack.length()) {

            if(haystack.charAt(left) == needle.charAt(scnd)) {
                scnd++;
                count--;

                if(count == 0) {
                    return left - scnd + 1;
                }
            }
            else {
                left = left - scnd;
                count = needle.length();
                scnd = 0;
            }

            left++;
        }

        return -1;
    }
}