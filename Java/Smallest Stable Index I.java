class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max=0;
        int i = 0;
        int result=k+1;
        while(i<nums.length){
            if(nums[i]>max){
                max=nums[i];
            }
            int min = Integer.MAX_VALUE;
            for(int j = i ; j < nums.length ; j++){
                if(min>nums[j]) min = nums[j];
            }
            if (result> max-min){
                    result=max-min;
                    return i;
                }
            i++;
        }
        return -1;
        
    }
}
