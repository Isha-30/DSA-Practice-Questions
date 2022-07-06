public class Solution {
    public int t2Sum(TreeNode A, int B) {
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(A, arr);
        int n = arr.size();
        int j = n-1, i = 0;
        while(i< j){
            if(arr.get(i)+arr.get(j) > B)
                j--;
            else if(arr.get(i) + arr.get(j) < B)
                i++;
            else return 1;
        }
        return 0;
    }
    
    public void inorder(TreeNode root, ArrayList<Integer> arr){
        if(root!= null){
            inorder(root.left, arr);
            arr.add(root.val);
            inorder(root.right, arr);
        }
    }
}
