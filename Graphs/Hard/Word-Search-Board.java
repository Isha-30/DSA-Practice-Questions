public class Solution {
    int n, m, len;
    int[] a = {-1, 0, 1, 0};
    int[] b = {0, 1, 0, -1};
    public int exist(ArrayList<String> A, String B) {
        n = A.size();
        m = A.get(0).length();
        len = B.length();
        
        int ans = 0;
        
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(A.get(i).charAt(j) == B.charAt(0)){
                    boolean res = dfs(i, j, A, B, 1);
                    if(res == true)
                        ans |= 1;
                    else
                        ans |= 0;
                    if(ans == 1)
                        return 1;
                }
            }
        }
        return ans;
    }
    
    private boolean dfs(int x, int y, ArrayList<String> A, String B, int idx){
        if(idx == len)
            return true;
        for(int i = 0; i<4; i++){
            int newx = a[i] + x;
            int newy = b[i] + y;
            
            if(newx<n && newx>=0 && newy<m && newy>=0 && A.get(newx).charAt(newy) == B.charAt(idx)){
                if(dfs(newx, newy, A, B, idx+1))
                    return true;
            }
        }
        return false;
    }
}
