class Solution {
    int rows, cols;
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        rows = grid2.length;
        cols = grid2[0].length;
        int res = 0;
        for(int i = 0; i< rows; i++){
            for(int j = 0; j<cols; j++){
                if(grid2[i][j] == 1){
                    res += dfs(grid1, grid2, i, j);
                }
            }
        }
        return res;
    }
    
    private int dfs(int[][] grid1, int[][] grid2, int i, int j){
        int res = 1;
        if(i<0 || i>=rows || j<0 || j>=cols || grid2[i][j] == 0)
            return 1;
        grid2[i][j] = 0;
        res &= dfs(grid1, grid2, i-1, j);
        res &= dfs(grid1, grid2, i+1, j);
        res &= dfs(grid1, grid2, i, j-1);
        res &= dfs(grid1, grid2, i, j+1);
        
        return res & grid1[i][j];
    }
}
