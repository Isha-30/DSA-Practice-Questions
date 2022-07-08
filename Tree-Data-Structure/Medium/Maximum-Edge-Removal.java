public class Solution {
    public int solve(int A, ArrayList<ArrayList<Integer>> edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        //create adjacency list
        for(ArrayList<Integer> edge : edges){
            int u = edge.get(0);
            int v = edge.get(1);
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        boolean[] vis = new boolean[A+1];
        int total = 0;
        dfs(adj, vis, 1, total);
        return total;
    }
    
    int dfs(ArrayList<ArrayList<Integer>> adj, boolean[] vis, int u, int total){
        vis[u] = true;
        
        int treeNodes = 1;
        
        for(int v: adj.get(u)){
            if(!vis[v]){
                int subTreeNodes = dfs(adj, vis, v, total);
                if(subTreeNodes%2 == 0)
                    total++;
                else
                    treeNodes += subTreeNodes;
            }
        }
        return treeNodes;
    }
}
