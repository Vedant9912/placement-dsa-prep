import java.util.Arrays;
class Solution {
    public int minRemove(int[] arr1, int[] arr2) {
        // code here
        int count=0;
        Map<Integer,Integer> map1 = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();
        for ( int num : arr1){
            map1.put(num,map1.getOrDefault(num,0)+1);
        }
        for ( int num : arr2){
            map2.put(num,map2.getOrDefault(num,0)+1);
        }
        for (Map.Entry<Integer,Integer> entry : map1.entrySet()){
            if (map2.containsKey(entry.getKey())){
                count+=Math.min(entry.getValue(),map2.get(entry.getKey()));
                
            }
        }
        return count;
        
    }
}
