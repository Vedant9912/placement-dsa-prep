class Solution {
    public int splitArray(int[] nums, int k) {
        int mid;
        int minLarg=0;
        int left =0;
        int right=0;
        for(int num: nums ){
            left=Math.max(left,num);
            right+=num;
        }

        while(left<=right){
            mid=(left+right)/2;
            int sum=0;
            int count=1;
            for(int i = 0 ; i < nums.length ; i++ ){
                if(sum+nums[i]>mid){
                sum=0;
                count++;
                }
                sum+=nums[i];
            }
            if(count<=k){
                minLarg=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
    
        }
        return minLarg;
    }
}
