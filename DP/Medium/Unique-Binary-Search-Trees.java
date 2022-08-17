class Solution {
    public int numTrees(int n) {
        int [] dp = new int[n+1];

        dp[0]= 1;//if 0 nodes were there in the tree
        dp[1] = 1;//if 1 node was there in the tree

        for(int nodes = 2; nodes <=n; nodes++){
            for(int root = 1; root<=nodes; root++){
                int left = root-1; //example - for 3rd node, left will be 1 & 2 that means 2 nodes on left
                int right = nodes - root; //example - for 2nd node, there will be total nodes - 2 i.e. 1 node on the right
                dp[nodes] += dp[left]*dp[right];
            }
        }       
        return dp[n];
    }
}
