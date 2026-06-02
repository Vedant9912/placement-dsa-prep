class Solution {
    public void rotate(int[][] matrix) {
        for(int i = 0 ; i < matrix.length; i++){
            for(int j=0; j<matrix.length;j++){
                if(i>=j){
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }


            }

        }
        for(int i=0 ; i<matrix.length;i++){
            int left=0;
            int right=matrix.length-1;
            while(left<right){
                int temp1 =matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp1;
                left++;
                right--;



            }

        }

        return ;
        
    }
}
