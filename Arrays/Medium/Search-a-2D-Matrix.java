class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int index = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        for(int i = 0; i<rows; i++){
            if(target > matrix[i][cols-1])
                continue;
            else if(target < matrix[i][cols-1]){
                index = i;
                break;
            }
            else
                return true;
        }
        for(int j = 0; j<cols; j++){
            if(matrix[index][j] == target)
                return true;
        }
        return false;
    }
}
