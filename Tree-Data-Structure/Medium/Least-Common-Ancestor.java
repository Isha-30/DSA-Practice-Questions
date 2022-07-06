public class Solution {
    int c;
    public int lca(TreeNode root, int B, int C) {
        c = 0;
        TreeNode node = check(root, B, C);
            if(c==2){
            return node.val;
        }
        else if(B==C && c==1)
            return node.val;
        return -1;
    }

    TreeNode check(TreeNode root, int B, int C) {
        if (root == null)
            return null;
        TreeNode l = check(root.left, B, C);
        TreeNode r = check(root.right, B, C);
        if (root.val == B || root.val == C) {
            c++;
            return root;
        }
        if (l != null && r != null)
            return root;
        if (l == null)
            return r;
        return l;
    }

}
