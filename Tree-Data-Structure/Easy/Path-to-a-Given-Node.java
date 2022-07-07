public class Solution {
    
    public ArrayList<Integer> solve(TreeNode A, int B) {
        ArrayList<Integer> arr = new ArrayList<>();
        recur(A, B, arr);
        return arr;
    }
    
    boolean recur(TreeNode root, int target, ArrayList<Integer> arr){
        if(root==null)
            return false;
        if(root.val == target){
            arr.add(root.val);
            return true;
        }
        arr.add(root.val);
        if(recur(root.left, target, arr) || recur(root.right, target, arr))
            return true;
        arr.remove(arr.size()-1);
        return false;
        
    }
}
