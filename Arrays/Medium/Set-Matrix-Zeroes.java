class Solution {
    public void setZeroes(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        boolean firstRow = false;
        boolean firstCol = false;
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                if(mat[i][j] == 0){
                    if(i==0)
                        firstRow = true;
                    if(j==0)
                        firstCol = true;
                    
                    mat[i][0] = 0;
                    mat[0][j] = 0;
                   
                }
            }
        }
        
        for(int i = 1; i<row; i++){
            for(int j = 1; j<col; j++){
                if(mat[i][0] == 0 || mat[0][j] == 0)
                    mat[i][j] = 0;
            }
        }
        
        if(firstRow){
            for(int j = 0; j<col; j++)
                mat[0][j] = 0;
        }
        
        if(firstCol){
            for(int i = 0; i<row; i++)
                mat[i][0] = 0;
        }
    }
}
