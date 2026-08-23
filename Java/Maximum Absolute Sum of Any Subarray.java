class Solution {
    public int maxAbsoluteSum(int[] nums) {
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
        return Math.max(maxcurr,Math.abs(mincurr));
        
    }
}
