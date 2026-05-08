class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int[] arr = new int[nums.length];
        int i=0;

        while (left<=right){
            if( Math.pow(nums[left],2)>Math.pow(nums[right],2)){
                arr[nums.length-1-i]=nums[left] * nums[left];
                i++;
                left++;
            }
            else{
                arr[nums.length-1-i]=nums[right] * nums[right];;
                i++;
                right--;

            }
           

        }
        return arr;
        
    }
}
