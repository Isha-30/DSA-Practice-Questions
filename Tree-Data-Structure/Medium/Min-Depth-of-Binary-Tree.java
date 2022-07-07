public class Solution {
    public int minDepth(TreeNode A) {
        if(A==null)
            return Integer.MAX_VALUE;
        if(A.left == null && A.right == null)
            return 1;
        return (1+ Math.min(minDepth(A.left), minDepth(A.right)));
    }
}
