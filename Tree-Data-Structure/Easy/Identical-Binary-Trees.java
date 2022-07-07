public class Solution {
    public int isSameTree(TreeNode A, TreeNode B) {
        
        boolean ans = helper(A, B);
        if(ans)
            return 1;
        else
            return 0;
    }
    
    public boolean helper(TreeNode root1, TreeNode root2){
        if(root1==null && root2==null)
            return true;
        if(root1==null || root2==null)
            return false;
        if(root1.val != root2.val)
            return false;
        return(helper(root1.left, root2.left)&&helper(root1.right, root2.right));
    }
}
