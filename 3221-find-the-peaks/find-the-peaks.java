class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        ArrayList<Integer> brr = new ArrayList<>();
        for(int i=1 ; i< mountain.length-1;i++){
            if(( mountain[i] > mountain[i-1]) && ( mountain[i] > mountain[i+1])){
                brr.add(i);
            }
        }
        return brr;
    }
}