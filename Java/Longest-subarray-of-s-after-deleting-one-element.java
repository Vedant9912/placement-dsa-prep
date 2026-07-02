class Solution {
    public int longestSubarray(int[] nums) {
        int count=0;
        int lastcount=0;
        int maxcount=0;
        for ( int i : nums){
            if (i==1){
                count++;
            }
            if(i==0){
                count=count-lastcount;
                lastcount=count;
            }
            if(maxcount<count){
                maxcount=count;
            }

        }
        if(maxcount==nums.length){
            return maxcount-1;
        }
        return maxcount;
        
    }
}
