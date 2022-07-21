class Solution {
    int rows, cols;
    public int maxAreaOfIsland(int[][] grid) {
        rows = grid.length;
        cols = grid[0].length;
        int maxArea = 0;
        for(int i = 0; i< rows; i++){
            for(int j = 0; j<cols; j++){
                if(grid[i][j] == 1){
                    maxArea = Math.max(maxArea, findArea(i, j, grid));
                }
            }
        }
        return maxArea;
    }
    private int findArea(int i, int j, int[][] grid){
        if(i < 0 || i>=rows || j<0 || j>=cols || grid[i][j] == 0)
            return 0;
        grid[i][j] = 0;
        return 1 + findArea(i+1, j, grid) + findArea(i-1, j, grid) + findArea(i, j+1, grid) + findArea(i, j-1, grid);
    }
}
