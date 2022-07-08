public class Solution {
    public int isSymmetric(TreeNode A) {
        if(isMirror(A, A))
            return 1;
        return 0;
    }
    
    boolean isMirror(TreeNode root1, TreeNode root2){
        if(root1==null && root2==null)
            return true;
        
        if(root1!=null && root2!=null && root1.val == root2.val)
            return (isMirror(root1.left, root2.right) && isMirror(root1.right, root2.left));
        return false;
    }
}
