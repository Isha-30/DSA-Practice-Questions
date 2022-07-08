public class Solution {
    Queue<Integer> st = new LinkedList<>();
    public Solution(TreeNode root) {
        Iterator(root);
    }
    
    public void Iterator(TreeNode root){
        if(root == null)
            return;
        Iterator(root.left);
        st.add(root.val);
        Iterator(root.right);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return st.size()>0;
    }

    /** @return the next smallest number */
    public int next() {
        int temp = st.poll();
        return temp;
    }
}
