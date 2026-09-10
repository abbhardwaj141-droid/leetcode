class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(p.length() > s.length()){
            return ans;
        }
        int[] p_freq = new int[26];
        int[] Windo_freq = new int[26];

        for(int i=0; i<p.length();i++){
            p_freq[p.charAt(i) - 'a']++;
        }
        int k = p.length();
        for(int i=0; i<k; i++){
            Windo_freq[s.charAt(i) - 'a']++;
        }
        if(Arrays.equals( p_freq, Windo_freq)){
            ans.add(0);
        }
        for(int i=k; i<s.length(); i++){
            Windo_freq[s.charAt(i) - 'a']++;
            Windo_freq[s.charAt(i-k) - 'a']--;

            if(Arrays.equals( p_freq, Windo_freq)){
               ans.add(i-k+1);
            }
        }
        return ans;
    }
}