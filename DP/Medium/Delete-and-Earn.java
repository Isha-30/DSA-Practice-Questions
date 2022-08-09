class Solution {
    public int deleteAndEarn(int[] nums) {
        int n = nums.length;
        int[] values = new int[10001];
        int[] dp = new int[10001];
        
        for(int num : nums){
            values[num] += num;
        }
    
        dp[0] = values[0];
        dp[1] = values[1];
        for(int i = 2; i<10001 ; i++){
            dp[i] = Math.max(values[i] + dp[i-2], dp[i-1]);
        }
        return dp[10000];
    }
}
