class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int maxsum=0;
        int sum=0;
        int temp=0;
        for(int i =k ; i < nums.length ; i++){
            if(temp<nums[i-k]){
                temp=nums[i-k];
            }
            sum=temp+nums[i];
            maxsum = Math.max(sum,maxsum);
            
        }
        return maxsum;
        
    }
}
