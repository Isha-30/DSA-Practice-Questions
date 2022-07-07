public class Solution {
    public int hasPathSum(TreeNode A, int B) {
        return recur(A, B, 0);
    }
    
    int recur(TreeNode root, int sum, int currSum){
        currSum+=root.val;
        if(root.left==null && root.right==null && sum == currSum)
            return 1;
        if(root.left == null && root.right == null && sum != currSum)
            return 0;
            
        int l = 0, r = 0;
        if(root.left != null)
            l = recur(root.left, sum , currSum);
        if(root.right!=null)
            r = recur(root.right, sum, currSum);
            
        return (l|r);
        
    }
}
