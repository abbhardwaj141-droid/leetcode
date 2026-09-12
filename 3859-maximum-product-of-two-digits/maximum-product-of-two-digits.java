class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        int i=0;
        while(i<n){
            int p = n%10;
            n =n /10;
            arr.add(p);
        }
        Collections.sort(arr);
        return arr.get(arr.size()-1) * arr.get(arr.size()-2);
    }
}