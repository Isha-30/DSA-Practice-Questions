public class Solution {
    public ArrayList<Integer> stepnum(int A, int B) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i<10; i++)
            dfs(res, A, B, i);
        Collections.sort(res);
        return res;
    }
    
    private void dfs(ArrayList<Integer> res, int A, int B, int i){
        if(i >= A && i<=B)
            res.add(i);
            
        if(i==0 || i>B)
            return;
        
        int temp = i%10;
        int x = i*10 + temp-1;
        int y = i*10 + temp+1;
        if(temp==0)
            dfs(res, A, B, y);
        else if(temp == 9)
            dfs(res, A, B, x);
        else{
            dfs(res, A, B, x);
            dfs(res, A, B, y);
        }
    }
}
