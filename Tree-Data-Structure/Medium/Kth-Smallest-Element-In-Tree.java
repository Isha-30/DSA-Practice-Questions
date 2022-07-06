public class Solution {
    public int kthsmallest(TreeNode root, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root, arr, k);
        return arr.get(k-1);
    }
    
    public void inorder(TreeNode root, ArrayList<Integer> arr, int k){
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;
        while(curr != null || !st.isEmpty()){
            while(curr!=null){
                st.push(curr);
                curr = curr.left;
            }
            curr = st.pop();
            arr.add(curr.val);
            if(arr.size() == k)
                return;
            curr = curr.right;
        }
    }
}
