class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int res = 0, n = grid.length;
        if(grid[0][0] == 1 )return -1; 
        int coor[][]={{1,1},{-1,-1},{1,0},{-1,0},{0,1},{0,-1},{1,-1},{-1,1}};
        
        
        Queue<int[]> q = new LinkedList();
        q.offer(new int[]{0,0});
        grid[0][0] = 1;
        while(!q.isEmpty()){
            int size = q.size(); 
            res++;
            for(int i = 0; i < size; i++){
                int[] cur = q.poll();
                if(cur[0] == n-1 && cur[1] == n-1)
                    return res;
                for(int[] co : coor){
                    int a = co[0] + cur[0], b = co[1] + cur[1];
                    if(a < 0 || a >= n || b < 0 || b >= n || grid[a][b] == 1)
                        continue;
                    
                    q.offer(new int[]{a, b});
                    grid[a][b]=1;
                }
            }
        }
        
        return -1;
    }
}
