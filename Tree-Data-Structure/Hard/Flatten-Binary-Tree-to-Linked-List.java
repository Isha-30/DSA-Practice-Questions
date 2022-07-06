public class Solution {
	public TreeNode flatten(TreeNode a) {
        TreeNode root = a;
        while(a != null){
            if(a.left != null){
                TreeNode temp = a.left;
                while(temp.right!=null)
                    temp = temp.right;
                temp.right = a.right;
                a.right = a.left;
                a.left = null;
            }
            a = a.right;
        }
        return root;
	}
}
