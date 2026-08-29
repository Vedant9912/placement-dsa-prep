class Solution {
    public int jump(int[] nums) {
        int[] dp=  new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            for(int j=i+1 ; j <= i+nums[i] ; j++){
                if(j>nums.length-1) break;
                if(i==0){
                    dp[j]+=1;
                }
                else{
                    if(dp[j]==0){
                        dp[j]=dp[i]+1;
                    }
                    else{
                    dp[j]=Math.min(dp[i]+1,dp[j]);
                    }
                }
                }
            }
        
        return dp[nums.length-1];
    }
}
