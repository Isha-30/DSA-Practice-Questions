public class Solution {
    public TreeNode help(TreeNode root) {
        if(root == null)
            return null;
        TreeNode temp = root.left;
        root.left = root.right;
        help(root.left);
        root.right = temp;
        help(root.right);
        return root;
    }
    
    public TreeNode invertTree(TreeNode root){
        return help(root);
    }
}
