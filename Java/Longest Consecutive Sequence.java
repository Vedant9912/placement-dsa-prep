class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            map.put(nums[i],nums[i]+1);
        }
        int maxcount=0;
        for(int num : map.keySet()){
            if(map.containsKey(num-1)){
                    continue;
                }
            boolean marked=true;
            int count=0;
            Integer element = num;
            while(marked){
                marked=false;
                if(map.containsKey(element)){
                    element=map.get(element);
                    count++;
                    marked=true;
                }

            }
            maxcount=Math.max(count, maxcount);

        }
        return maxcount;  
    }
}
