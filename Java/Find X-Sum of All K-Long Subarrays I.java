class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int[] arr = new int[nums.length - k +1];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0 ; i < arr.length ; i++){
            int sum=0;
            map.clear();
            for(int num=i; num<k+i;num++){
                map.put(nums[num],map.getOrDefault(nums[num],0)+1);
            }
            List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
            list.sort((a, b) -> {
                int cmp = b.getValue().compareTo(a.getValue());
                if (cmp != 0) {
                    return cmp;
                    }
                return b.getKey().compareTo(a.getKey());
                }
                );
            for (int j = 0; j < Math.min(x, list.size()); j++) {
                sum+=list.get(j).getKey() * list.get(j).getValue();
            }
            arr[i]=sum;


        }
        return arr;
        
        
    }
}
