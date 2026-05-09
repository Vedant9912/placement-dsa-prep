class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0 ;
        int right =numbers.length-1;
        int total=0;
        while( left<right ){
            total=numbers[left]+numbers[right];
            if(total==target){
                return new int[]{left+1,right+1};
            }
            if ( total>target){
                right--;
            }
            else{
                left++;
            }
            
        }
        return new int[]{};
    }
}
