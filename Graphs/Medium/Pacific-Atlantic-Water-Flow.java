class Solution {
        public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        if (matrix == null || matrix.length == 0) 
            return new ArrayList<>();

        int[][] dirs = new int[][]{{-1, 0}, {0, 1}, {1, 0}, {0, -1}};     // Up, right, down, left.
        List<List<Integer>> result = new ArrayList<>();
        boolean[][] pacific = new boolean[matrix.length][matrix[0].length];   
        boolean[][] atlantic = new boolean[matrix.length][matrix[0].length];   

        for (int row = 0; row < matrix.length; ++row) {
            // Left edge (all values in the 0-th column).
            if (!pacific[row][0]) 
                dfs(matrix, dirs, pacific, row, 0);    
            // Right edge (all values in the last column).
            if (!atlantic[row][matrix[0].length - 1]) 
                dfs(matrix, dirs, atlantic, row, matrix[0].length - 1);  
        }

        for (int col = 0; col < matrix[0].length; ++col) {
            // Top edge (all values in the 0-th row).
            if (!pacific[0][col]) 
                dfs(matrix, dirs, pacific, 0, col);   
            // Bottom edge (all values in last row).
            if (!atlantic[matrix.length - 1][col]) 
                dfs(matrix, dirs, atlantic, matrix.length - 1, col);    
        }

        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[0].length; ++j) {
                if (pacific[i][j] && atlantic[i][j]) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(i); temp.add(j);
                    result.add(temp);
                }
            }
        }   
        return result;
    }

    private void dfs(int[][] matrix, int[][] dirs, boolean[][] visited, int row, int col) {
        visited[row][col] = true;
        for (int[] dir : dirs) {
            int newRow = row + dir[0], newCol = col + dir[1];
            if (0 <= newRow && newRow < matrix.length && 0 <= newCol && newCol < matrix[0].length && !visited[newRow][newCol] && matrix[row][col] <= matrix[newRow][newCol]) {
                dfs(matrix, dirs, visited, newRow, newCol);  
            }
        }
    }
}
