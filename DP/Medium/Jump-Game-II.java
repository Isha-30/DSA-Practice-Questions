class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if(n==1)
            return 0;
        int reachable = 0;
        int jumps = 0, nextJump = 0;
        
        for(int i = 0; i<n; i++){
            reachable = Math.max(reachable, i+nums[i]);
            
            if(i == nextJump){
                jumps++;
                nextJump = reachable;
                
                if(nextJump == n-1)
                    break;
            }
        }
        return jumps;
    }
}
