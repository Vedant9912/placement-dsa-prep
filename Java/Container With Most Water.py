class Solution {
    public int maxArea(int[] height) {
        int maxx=0;
        int currentmax=0;
        int left=0;
        int right=height.length-1;
        while (left<right){

            currentmax=Math.min(height[left], height[right])*(right-left);
            if (currentmax>maxx){
                maxx=currentmax;
                }
            if (height[left]>height[right]){
                right--;
            }
            else{
                left++;
            }
            
        }
        return maxx;
        
    }
}
