class Solution {
    public int minMutation(String start, String end, String[] bank) {
        return dfs(start, end, bank, new HashSet<>());
    }
    
    int dfs(String start, String end, String[] bank, Set<String> visited) {
        if (start.equals(end)) 
            return 0;
        
        int min = Integer.MAX_VALUE;
        for (String b : bank) {
            int diff = 0;
            for (int i = 0; i < start.length(); i++) {
                if (start.charAt(i) != b.charAt(i)) 
                    diff++;
                if (diff > 1) 
                    break;
            }
            if (diff == 1 && !visited.contains(b)) {
                visited.add(b);
                int h = dfs(b, end, bank, visited);
                if (h >= 0) {
                    min = Math.min(min, 1 + h);
                }
                visited.remove(b);
            }
        }
        
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
