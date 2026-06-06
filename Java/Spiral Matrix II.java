class Solution {
    public int[][] generateMatrix(int n) {
        int[][] newarr = new int[n][n];
        int top=0;
        int left=0;
        int right=n-1;
        int bottom=n-1;
        int count=1;
        while(top<= bottom && left<=right){
            for(int i = left ; i <= right ; i++){
                newarr[top][i]=count++;
            }
            top++;
            for(int i = top ; i <=bottom  ; i++){
                newarr[i][right]=count++;    
            }
            right--;
            if(top<=bottom){
            for(int i = right ; i >= left ; i--){
                newarr[bottom][i]=count++;
            }
            }
            bottom--;
            if(left<=right){
            for(int i = bottom  ; i >= top ; i--){
                newarr[i][left]=count++;  
            }
            left++;  
            }}
            return newarr;
        
    }
}
