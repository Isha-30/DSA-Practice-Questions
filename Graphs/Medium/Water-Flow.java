public class Solution {
    public int solve(ArrayList<ArrayList<Integer>> A) {
        if(A.size() == 0)
            return 0;
        
        int row = A.size();
        int col = A.get(0).size();
        
        boolean[][] red = new boolean[row][col];
        boolean[][] blue = new boolean[row][col];
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                red[i][j] = false;
                blue[i][j] = false;
            }
        }
        
        for(int i = 0; i<row; i++){
            dfs(A, i, 0, Integer.MIN_VALUE, blue);
            dfs(A, i, col-1, Integer.MIN_VALUE, red);
        }
        for(int j = 0; j<col; j++){
            dfs(A, 0, j, Integer.MIN_VALUE, blue);
            dfs(A, row-1, j, Integer.MIN_VALUE, red);
        }
        
        int count = 0;
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                if(blue[i][j] && red[i][j])
                    count++;
            }
        }
        
        return count;
    }
    
    private void dfs(ArrayList<ArrayList<Integer>> adj, int i, int j, int prev, boolean[][] lake){
        if(i<0||i>=lake.length||j<0||j>=lake[0].length)
            return;
            
        if(lake[i][j])
            return;
            
        if(adj.get(i).get(j) < prev)
            return;
            
        lake[i][j]= true;
        
        dfs(adj, i+1, j, adj.get(i).get(j), lake);
        dfs(adj, i, j+1, adj.get(i).get(j), lake);
        dfs(adj, i-1, j, adj.get(i).get(j), lake);
        dfs(adj, i, j-1, adj.get(i).get(j), lake);
    }
}
