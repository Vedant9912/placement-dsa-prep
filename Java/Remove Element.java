class Solution {
    public int removeElement(int[] nums, int val) {
        int right=nums.length-1;
        int left=0;
        while(left<=right){
            if (nums[left]==val){
                int temp = nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                right--;

            }
            else{
            left++;}

        }
        return left;
        
    }
}
