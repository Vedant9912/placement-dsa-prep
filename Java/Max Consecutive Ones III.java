class Solution {
    public int longestOnes(int[] nums, int k) {
        int count1=0;
        int maxcount1=0;
        for(int i =0 ; i < nums.length ; i++){

            if(nums[i]==0){
                int count0=k;
                int j=i;
                while(j<nums.length){
                    if(nums[j]==0){
                        if(count0!=0){
                        count0--;
                        count1++;}
                        else{
                            break;
                        }
                    }
                    else{
                        count1++;
                    }
                    j++;


                }
                maxcount1 = Math.max(maxcount1 , count1);
                count1=0;

            }
            else{
                count1++;
            }
            

        }
        maxcount1 = Math.max(maxcount1 , count1);
        return maxcount1;
        
    }
}
