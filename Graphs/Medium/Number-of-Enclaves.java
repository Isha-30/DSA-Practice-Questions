class Solution {
    int rows, cols;
    public int numEnclaves(int[][] grid) {
        rows = grid.length;
        cols = grid[0].length;
        
        int result = 0;
        
        for(int i = 0; i < rows; i++){
            for(int j = 0; j<cols; j++){
                if(grid[i][j]==1){
                    int count = dfs(grid, i, j);
                    if(count > 0){
                        result += count;
                    }
                }
            }
        }
        return result;
    }
    
    private int dfs(int[][] grid, int i, int j){
        if(i<0 || i >= rows || j<0 || j>=cols)
            return -1;
        if(grid[i][j] == 0 )
            return 0;
    
        grid[i][j] = 0;
        int top = dfs(grid, i-1, j);
        int bottom = dfs(grid, i+1, j);
        int left = dfs(grid, i, j-1);
        int right = dfs(grid, i, j+1);
        
        if(top == -1 || bottom == -1 || left == -1 || right == -1)
            return -1;
        
        return 1 + top + bottom + left + right;
    }
}
