public class Solution {
    public int maxDepth(TreeNode A) {
        if(A == null)
            return 0;
        return (1+ Math.max(maxDepth(A.left), maxDepth(A.right)));
    }
}
