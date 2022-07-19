public class Solution {
    public int solve(int A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i<=A; i++){
            adj.add(new ArrayList<Integer>());
        }
        for(ArrayList<Integer> edge : B){
            int src = edge.get(0);
            int dest = edge.get(1);
            adj.get(src).add(dest);
        }
        boolean[] vis = new boolean[A+1];
        if(dfs(adj, 1, A, vis))
            return 1;
        return 0;
    }
    
    private boolean dfs(ArrayList<ArrayList<Integer>> adj, int src, int des, boolean[] vis){
        if(src == des)
            return true;
            
        vis[src] = true;
        
        for(int neighbor : adj.get(src)){
            if(vis[neighbor] == false){
                boolean path = dfs(adj, neighbor, des, vis);
                if(path)
                    return true;
            }
        }
        return false;
    }
}
