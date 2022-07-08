public class Solution {
    public TreeNode solve(TreeNode root) {
        if(root == null)
            return null;
        if(root.left != null && root.right != null){
            root.left = solve(root.left);
            root.right = solve(root.right);
        }
        else if(root.left == null && root.right == null)
            return root;
        else if(root.left==null)
            return solve(root.right);
        else    
            return solve(root.left);
        return root;
    }
}
