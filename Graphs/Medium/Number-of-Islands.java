class Solution {
    public int numIslands(char[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        //boolean[][] visited = new boolean[r][c];
        int count = 0;
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                if(grid[i][j] == '1'){
                    islands(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }
    
    private void islands(char[][] grid, int i, int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j] == '0')
            return;
        
        grid[i][j] = '0';
        islands(grid, i+1, j);
        islands(grid, i-1, j);
        islands(grid, i, j+1);
        islands(grid, i, j-1);
    }
}
