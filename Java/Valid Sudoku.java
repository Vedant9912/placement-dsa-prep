class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0 ; i < 9 ; i++){
            HashSet<Character> set = new HashSet<>();
            for(int j = 0 ; j < 9 ; j++){
                if(set.contains(board[i][j])){
                    return false;
                }
                if(board[i][j]!='.') set.add(board[i][j]);
            }
        }
        for(int i = 0 ; i < 9 ; i++){
            HashSet<Character> set = new HashSet<>();
            for(int j = 0 ; j < 9 ; j++){
                if(set.contains(board[j][i])){
                    return false;
                }
                if(board[j][i]!='.') set.add(board[j][i]);
            }
        }
        HashSet<Character>[] grid = new HashSet[9];
        for(int i=0 ; i<9 ; i++){
            grid[i]=new HashSet<>();
        }
        for(int i=0 ; i < 9 ; i++){
            for(int j = 0 ; j < 9 ;j++){
                if(board[i][j]=='.') continue;
                int index=3*(i/3)+j/3;
                if(grid[index].contains(board[i][j])){
                    return false;
                }
                grid[index].add(board[i][j]);
            }

        }

        return true;
        
    }
}
