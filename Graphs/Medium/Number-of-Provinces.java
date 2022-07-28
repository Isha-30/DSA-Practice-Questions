class Solution {
    public int findCircleNum(int[][] isConnected) {
        int vtces = isConnected.length;
        boolean[] visited = new boolean[vtces];
        int count = 0;
        
        for(int v = 0; v<vtces; v++){
            if(visited[v] == false){
                getConnected(isConnected, v, visited);
                count++;
            }
        }
        return count;
    }
    
    public void getConnected(int[][] graph, int src, boolean[] visited){
        visited[src] = true;
        
        for(int i = 0; i<graph.length; i++){
            if(graph[src][i] == 1 && visited[i] == false){
                getConnected(graph, i, visited);
            }
        } 
    }
}
