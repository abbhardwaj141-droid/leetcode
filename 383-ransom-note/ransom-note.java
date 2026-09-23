class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];
        int[] freq2 = new int[26];
        for (int i = 0; i < ransomNote.length(); i++) {
            freq[ransomNote.charAt(i) - 'a']++;
        }
        for (int i = 0; i < magazine.length(); i++) {
            freq2[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > freq2[i]) {
                return false;
            }
        }
        return true;
    }
}