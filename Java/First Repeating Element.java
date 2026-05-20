class Solution {
    public static int firstRepeated(int[] arr) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int index=-1;
        for(int i=arr.length-1; i>= 0; i--){
            if (map.containsKey(arr[i])){
                index=i+1;
            }
            else{
            map.put(arr[i],i);
        }
            
        }
        return index;
            
        
    }
}
