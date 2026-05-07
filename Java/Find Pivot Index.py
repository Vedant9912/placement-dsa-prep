class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int num :nums){
    sum += num;
}
        int total=sum;
        int leftsum=0;
        
        for (int i=0 ; i<nums.length ; i++){
            total-=nums[i];
      
            if( total == leftsum){
                return i;
            }
            leftsum+=nums[i];

        }
        return -1;

    }
}
