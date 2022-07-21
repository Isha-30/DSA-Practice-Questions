class Solution {
    int rows, cols;
    public int closedIsland(int[][] grid) {
        rows = grid.length;
        cols = grid[0].length;
        int count = 0;
        
        for(int i = 0; i< rows; i++){
            for(int j = 0; j<cols; j++){
                if(grid[i][j] == 0){
                    count += dfs(i, j, grid);
                }
            }
        }
        return count;
    }
    
    private int dfs(int i, int j, int[][] grid){
        if(i<0 || i>=rows || j<0 || j>=cols)
            return 0;
        if(grid[i][j] == 1)
            return 1;
        
        grid[i][j] = 1;
        
        return dfs(i+1, j, grid) & dfs(i-1, j, grid) & dfs(i, j+1, grid) & dfs(i, j-1, grid);
    }
}
