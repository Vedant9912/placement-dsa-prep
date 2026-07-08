class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int a=0 ;
        int b=0 ;
        int sum=0;
        HashSet <Integer> set = new HashSet<>();
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[0].length;j++){
                if(!set.contains(grid[i][j])){
                set.add(grid[i][j]);
                sum+=grid[i][j];
                }
                else{
                    a=grid[i][j];
                }

            }
        }
        int n=grid.length*grid.length;
        b=(n*(n+1))/2-sum;
        return new int[]{a,b};

        
    }
}
