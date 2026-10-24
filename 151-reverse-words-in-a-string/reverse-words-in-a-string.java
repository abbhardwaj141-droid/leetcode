class Solution {
    public String reverseWords(String s) {

        s = s.trim().replaceAll("\s+", " ");
        char[] arr = s.toCharArray();
        int left = 0;
        
        for (int j = 0; j <=arr.length; j++) {
           if (j == arr.length || arr[j] == ' ') {
                int right = j - 1;
                while (left < right) {
                    char temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }
                left = j + 1;
            }
        }
        int lo = 0, hi = arr.length - 1;
        while (lo < hi) {
            char temp = arr[lo];
            arr[lo] = arr[hi];
            arr[hi] = temp;
            lo++;
            hi--;
        }
        return new String(arr);
    }
}