class Solution {
    public int singleNumber(int[] arr) {
      int result =0;
      for(int ele : arr){
        result = result ^ ele;
      }
      return result;
    }
}