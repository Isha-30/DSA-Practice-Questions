class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int rows = maze.length, cols = maze[0].length, queueSize;
        Queue<int[]> queue = new LinkedList<>();
        int[] curr;
        int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
        int x, y, steps = 0;
        
        queue.offer(entrance);
        maze[entrance[0]][entrance[1]] = '+';
        
        while (!queue.isEmpty()) {
            queueSize = queue.size();
            steps++;
            
            for (int i=0;i<queueSize;i++) {
                curr = queue.poll();
                
                for (int[] dir: dirs) {
                    x = dir[0]+curr[0];                    
                    y = dir[1]+curr[1];
                    
                    if (x<0||x>=rows||y<0||y>=cols) continue;
                    if (maze[x][y] == '+') continue;
                    
					// check if we have reached boundary
                    if (x==0||x==rows-1||y==0||y==cols-1) 
                        return steps;
                    
                    queue.offer(new int[]{x, y});
                    maze[x][y] = '+';
                }
            }
        }
        
        return -1;
    }
}
