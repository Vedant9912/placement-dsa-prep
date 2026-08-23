class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int curr=nums[0];
        int maxcurr=nums[0];
        int ncurr=nums[0];
        int mincurr=nums[0];
        int total=nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            curr=Math.max(curr+nums[i], nums[i]);
            maxcurr=Math.max(curr,maxcurr);
            ncurr=Math.min(ncurr+nums[i], nums[i]);
            mincurr=Math.min(ncurr,mincurr);
            total+=nums[i];  
        }
        if (maxcurr < 0)
            return maxcurr;
        return Math.max(maxcurr,total-mincurr);
        
    }
}
