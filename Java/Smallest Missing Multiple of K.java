class Solution {
    public int missingMultiple(int[] nums, int k) {
        for(int i =0 ; i < nums.length ; i++){
            boolean found=false;
            for(int j = 0 ; j < nums.length ; j++){
                if(nums[j]==k*(i+1)){
                    found=true;
                }


            }
            if(found==false){
                return k*(i+1);
            }
           
        }
         return k*(nums.length+1);
        
    }
}
