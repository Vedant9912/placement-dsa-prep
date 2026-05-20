class Solution {
    int countZeroes(int[] arr) {
        // code here
        int left=0;
        int right=arr.length-1;
        while (left <= right) {
            int mid=left+(right-left)/2;
            
            if( arr[mid] == 1){
                left=mid+1;
                
            }
            else{
                right=mid-1;
            }
            
        }
        return arr.length - left;
        
    }
}
