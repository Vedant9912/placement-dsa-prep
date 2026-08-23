class Solution {
    public int maxProduct(int[] nums) {
        int curr=nums[0];
        int ncurr=nums[0];
        int maxcurr=nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            int oldcurr=curr;
            curr=Math.max(Math.max(curr*nums[i], nums[i]),ncurr*nums[i]);
            ncurr=Math.min(Math.min(oldcurr*nums[i], nums[i]),ncurr*nums[i]);
            maxcurr=Math.max(curr,maxcurr);

        }
        return maxcurr;
        
        
    }
}
