class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE, profit = 0, n = prices.length;
        for(int i= 0; i<n; i++){
            min = Math.min(min, prices[i]);           
            profit = Math.max(profit, prices[i] - min);
        }
        return profit;
    }
}
