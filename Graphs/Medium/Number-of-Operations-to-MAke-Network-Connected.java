class Solution {
    public int makeConnected(int n, int[][] connections) {
         if (connections.length < n - 1) // To connect all nodes need at least n-1 edges
             return -1; 
        List<Integer>[] graph = new List[n];
        for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();
        for (int[] c : connections) {
            graph[c[0]].add(c[1]);
            graph[c[1]].add(c[0]);
        }
        int components = 0;
        boolean[] visited = new boolean[n];
        for (int v = 0; v < n; v++){
            if(visited[v] == false){
                dfs(v, graph, visited);
                components++;
            }
        }
        return components - 1; // Need (components-1) cables to connect components together
    }
    void dfs(int u, List<Integer>[] graph, boolean[] visited) {
        visited[u] = true;
        for (int v : graph[u]){
            if(visited[v]==false)
                dfs(v, graph, visited);
        }
    }
}
