class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map= new HashMap<>();
        for(int num =0 ; num < nums.length ; num++){
        map.put(nums[num], map.getOrDefault(nums[num], 0) + 1);}
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        int[] result= new int[k];
        for( int i =0 ; i<k ; i++){
            result[i]=list.get(i).getKey();

        }
        return result;

        
        
    }
}
