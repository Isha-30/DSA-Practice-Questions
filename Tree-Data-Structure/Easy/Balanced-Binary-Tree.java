public class Solution {
    public int isBalanced(TreeNode A){
        if(getHeight(A)<0)
            return 0;
        return 1;
    }
    
    public int getHeight(TreeNode A) {
        if(A == null)
            return 0;
        int lh = getHeight(A.left);
        if(lh<0)
            return -1;
        int rh = getHeight(A.right);
        if(rh< 0)
            return -1;
        if(Math.abs(lh-rh) > 1)
            return -1;
        else
            return 1+(Math.max(lh, rh));
        
    }
}
