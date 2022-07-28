class Solution {
    public int makeConnected(int n, int[][] connections) {
        if (connections.length < n - 1) 
            return -1; 
        List<Integer>[] graph = new List[n];
        for (int i = 0; i < n; i++) 
            graph[i] = new ArrayList<>();
        for (int[] c : connections) {
            graph[c[0]].add(c[1]);
            graph[c[1]].add(c[0]);
        }
        
        int components = 0;
        boolean[] visited = new boolean[n];
        for (int v = 0; v < n; v++) 
            components += bfs(v, graph, visited);
        
        return components - 1; 
    }
    
    int bfs(int src, List<Integer>[] graph, boolean[] visited) {
        if (visited[src]) return 0;
        visited[src] = true;
        Queue<Integer> q = new LinkedList<>();
        q.offer(src);
        
        while (!q.isEmpty()) {
            int rem = q.poll();
            for (int v : graph[rem]) {
                if (!visited[v]) {
                    visited[v] = true;
                    q.offer(v);
                }
            }
        }
        return 1;
    }
}
