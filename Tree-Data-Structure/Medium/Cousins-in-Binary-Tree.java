public class Solution {
    public ArrayList<Integer> solve(TreeNode A, int B) {
        Deque<TreeNode> q = new LinkedList<>();
        q.add(A);
        while(q.size()!=0)
        {
            int n = q.size();
            boolean f1 = false;
            for(int i=0; i<n; i++)
            {
                TreeNode ptr = q.pop();
                if(ptr.left!=null)
                {
                    if(ptr.left.val == B)
                    {
                        f1 = true;
                        continue;
                    }
                    else
                        q.add(ptr.left);
                }
                if(ptr.right!=null)
                {
                    if(ptr.right.val!=B)
                        q.add(ptr.right);
                    else
                    {
                        if(q.peekLast()==ptr.left)
                            q.pollLast();
                        f1 = true;
                    }
                }
            }
            if(f1)
            break;
        }     
        ArrayList<Integer> ans = new ArrayList<>();
        while(q.size()!=0)
        {
            int v = q.pop().val;
            ans.add(v);
        }
        return ans;
    }
}
