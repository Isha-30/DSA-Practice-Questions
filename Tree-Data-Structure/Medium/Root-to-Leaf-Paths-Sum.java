public class Solution {
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode A, int B) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        pathSum(result, new ArrayList<>(), A,B);
        return result;

   
    }
     private void pathSum(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list, TreeNode root, int targetSum) {
        if(root == null) {
            return;
        }
       
        list.add(root.val);
        if(root.val == targetSum && root.left == null && root.right == null) {
            result.add(new ArrayList<>(list));
        }
       
        pathSum(result, list, root.left, targetSum-root.val);
        pathSum(result, list, root.right, targetSum-root.val);
        list.remove(list.size()-1); 
    }
}
