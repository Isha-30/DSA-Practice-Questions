class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for(List<Integer> row : wall){
            int edgePos = 0;
            for(int b = 0; b<row.size()-1; b++){//bricks in each row
                edgePos += row.get(b);
                map.put(edgePos, map.getOrDefault(edgePos, 0)+1);
                max = Math.max(max, map.get(edgePos));
            }
        }
        return wall.size()-max;
    }
}
