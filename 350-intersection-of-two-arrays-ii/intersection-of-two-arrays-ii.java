class Solution {        
    public int[] intersect(int[] num1, int[] num2) {
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for(int i=0; i<num1.length; i++){
           map1.put(num1[i], map1.getOrDefault(num1[i], 0) + 1);
        }
        for(int i=0; i<num2.length; i++){
           map2.put(num2[i], map2.getOrDefault(num2[i], 0) + 1);
        }
        ArrayList<Integer> arr = new ArrayList<>();
       for (int key : map1.keySet()) {
            if (map2.containsKey(key)) {
                int count = Math.min(map1.get(key),(map2.get(key)));
                  for(int i=0; i<count; i++){
                    arr.add(key);
                  }
            }
        }
        int[] arr2 = new int[arr.size()];
        for(int i =0;i<arr2.length;i++){
            arr2[i] = arr.get(i);
        }
        return arr2;
    }
}