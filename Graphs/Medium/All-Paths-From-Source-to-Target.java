class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int len = graph.length;
        boolean visited[] = new boolean[len];
        list.add(0);
        paths(graph, 0, len-1, visited, result, list);
        return result;
    }
    
    public void paths(int[][]graph, int src, int des, boolean[] visited, List<List<Integer>> result, List<Integer> list){
        if(src == des){
            result.add(new ArrayList<>(list));
            return;
        }
        
        visited[src] = true;
        for(int edge : graph[src]){
            if(!visited[edge]){
                list.add(edge);
                paths(graph, edge, des, visited, result, list);
                list.remove(list.size() - 1);
            }
        }
        visited[src] = false;
    }
}
