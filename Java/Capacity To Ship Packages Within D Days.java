class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=0;
        int right=0;
        int midLarg=0;
        for(int i = 0 ; i < weights.length ; i++){
            left=Math.max(weights[i],left);
            right+=weights[i];
        }
        while(left<=right){
                int mid=(left+right)/2;
                int count=1;
                int sum=0;
                for(int i = 0; i < weights.length ; i++){
                    if(sum + weights[i] >mid){
                        count++;
                        sum=0;
                    }
                    sum+=weights[i];
                    if(count>days){
                        break;
                    }
                }
                if(count<=days){
                    midLarg=mid;
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
                }

                return midLarg;
                
            
        
    }
}
