 import java.util.*;
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        long total=0;
        Arrays.sort(nums);
        List<List<Integer>> arr = new ArrayList<>();
        for(int i =0 ; i < nums.length-3; i++){
             if (i>0 && nums[i]==nums[i-1]){
                    continue;
                }
            for ( int j =i+1 ; j < nums.length-2; j++){
                if (j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                int left =j+1;
                int right=nums.length-1;
                while (left < right){
                    total=(long)nums[left]+nums[right]+nums[i]+nums[j];
                    if (total == target){
                        arr.add(Arrays.asList(nums[left],nums[right],nums[i],nums[j]));
                        while(left<right && nums[left]==nums[left+1]){
                        left++;
                        }
                        while(left<right && nums[right]==nums[right-1]){
                        right--;
                        }
                        left++;
                        right--;
                    }
                    else if(total>target){
                        right--;
                    }
                    else{
                        left++;
                    }
                    
                }

            }

        }
        return arr;
        
    }
}
