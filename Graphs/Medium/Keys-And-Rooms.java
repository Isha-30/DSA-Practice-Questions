class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        List<List<Integer>> comps = new ArrayList<>();
        int vtces = rooms.size();
        boolean[] visited = new boolean[vtces];
     for(int v = 0; v<vtces; v++){
        if(visited[v] == false){
           List<Integer> comp = new ArrayList<>();
           getConnected(rooms, v, comp, visited);
           comps.add(comp);
        }
     }

      return comps.size()==1;
    }
    
    public static void getConnected(List<List<Integer>> graph, int src, List<Integer> comp, boolean[] visited){
      visited[src] = true;
      comp.add(src);

      for(int e : graph.get(src)){
         if(visited[e] == false){
            getConnected(graph, e, comp, visited);
         }
      }
   }   
}
