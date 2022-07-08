public class Solution {
    public void connect(TreeLinkNode root) {
        Deque<TreeLinkNode> q = new LinkedList<>();
        q.add(root);
        while(q.size()!=0){
            int n = q.size();
            for(int i =0; i<n; i++){
                TreeLinkNode ptr = q.poll();
                if(i == n-1)
                    ptr.next = null;
                else
                    ptr.next = q.peek();
                if(ptr.left != null)
                    q.add(ptr.left);
                if(ptr.right!= null)
                    q.add(ptr.right);
            }
        }
    }
}
