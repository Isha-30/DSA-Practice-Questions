class Solution {
    HashMap<Integer, Integer> map = new HashMap<>();
    int max = 0;
    public int[] findFrequentTreeSum(TreeNode root) {
        dfs(root);
        ArrayList<Integer> ans = new ArrayList<>();
        for(int n : map.keySet()){
            if(map.get(n) == max)
                ans.add(n);
        }
        return ans.stream().mapToInt(i -> i).toArray();
    }
    
    private int dfs(TreeNode root){
        if(root == null)
            return 0;
        int sum = dfs(root.left) + dfs(root.right) + root.val;
        map.put(sum, map.getOrDefault(sum, 0)+1);
        max = Math.max(max, map.get(sum));
        return sum;
    }
}
