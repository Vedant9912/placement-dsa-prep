
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum=0;
        int closestsum=nums[0] + nums[1] + nums[2];
        for( int i =0 ; i < nums.length-2 ; i++){
            int left =i+1 ;
            int right= nums.length-1;
            while(left<right){
                sum=nums[left]+nums[right]+nums[i];
                if (sum==target){
                    return sum;
                    }
            
                else if (sum>target){
                    right--;

                }
                else{
                    left++;
                }
                if (Math.abs(target-closestsum)>Math.abs(target-sum)){
                closestsum=sum;
            
            
                
            }
            }
        }
        return closestsum;
        
    }
}
