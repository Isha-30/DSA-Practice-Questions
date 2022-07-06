public class Solution {
    public ArrayList<Integer> preorderTraversal(TreeNode A) {
        ArrayList<Integer> arr = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = A;
        while(curr != null || !st.isEmpty()){
            while(curr!=null){
                arr.add(curr.val);
                st.push(curr);
                curr = curr.left;
            }
            
            curr = st.pop();
            curr = curr.right;
        }
        return arr;
    }
}
