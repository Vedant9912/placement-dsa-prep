class Solution {
    public int climbStairs(int n) {
        if(n==1){
            return 1;
        }
        if(n==2) return 2;
        int prev0=1;
        int prev1=2;
        int cur=0;
        for(int i=2; i< n ; i++){
            cur=prev1+prev0;
            prev0=prev1;
            prev1=cur;


        }
        return cur;
    }
}
