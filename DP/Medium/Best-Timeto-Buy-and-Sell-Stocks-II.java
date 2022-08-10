class Solution {
    public int maxProfit(int[] values) {
        int n=values.length;
        int[] dp = new int[2];
        for(int ind=n-1;ind>=0;ind--){
            int profit=0;
            for(int buy=0;buy<=1;buy++){
                if(buy==1){
                    profit= Math.max(-values[ind]+dp[0],dp[1]); //maximum between if i buy at current index & not buy at current index 
               }
               else{
                   profit= Math.max(values[ind]+dp[1],dp[0]);//maximum between if i sell at current index & not sell at current index 
               }
                dp[buy]=profit;
            }
        }
        return dp[1];
    }
}
