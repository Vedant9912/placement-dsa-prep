class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int left=0;
        int right=m-1;
        int mid=(n-1)/2;
        int top = 0;
        int bottom = n - 1;
        while (top <= bottom) {
            mid = top + (bottom - top) / 2;
            if (target > matrix[mid][m - 1]) top = mid + 1;
            else if (target < matrix[mid][0]) bottom = mid - 1;
            else break;
}
        int avg;
        while(left<=right){
            avg=(left+right)/2;
            if(matrix[mid][avg]>target){
                right=avg-1;
            }
            else if(matrix[mid][avg]<target){
                left=avg+1;
            }
            else{
                return true;
            }
        
    }
    return false;
}
}
