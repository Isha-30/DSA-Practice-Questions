class Solution {
    public boolean canReach(int[] arr, int start) {
        return reachable(arr, start, 0);
    }
    
    private boolean reachable(int[] arr, int i, int count){
        if(i<0 || i>=arr.length || count >= arr.length)
            return false;
        
        if(arr[i] == 0)
            return true;
        
        return reachable(arr, i+arr[i], count+1) || reachable(arr, i-arr[i], count+1);
    }
}
