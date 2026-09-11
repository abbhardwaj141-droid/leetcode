class Solution {
    public int maxDistinct(String s) {
        // HashSet<Character> set = new HashSet<>();
        // for (int i = 0; i < s.length(); i++) {
        //     set.add(s.charAt(i));
        // }
        // return set.size();

        int[] fre = new int[26];
        for (int i = 0; i < s.length(); i++) {
            fre[s.charAt(i) - 'a']++;
        }
        int count = 0;
        for (int i = 0; i < fre.length; i++) {
            if (fre[i] != 0) {
                count++;
            }
        }
        return count;
    }
}