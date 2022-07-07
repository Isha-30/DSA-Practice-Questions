public class Solution {
    public int sumNumbers(TreeNode A) {
        int ans = recur(A, 0);
        return ans%1003;
    }
    
    int recur(TreeNode root, int sum){
        sum = (sum*10 + root.val)%1003;
        
        if(root.left == null && root.right == null)
            return sum;
            
        int l = 0, r = 0;
        if(root.left != null)
            l = recur(root.left, sum);
        if(root.right != null)
            r = recur(root.right, sum);
        return(l+r);
    }
}
