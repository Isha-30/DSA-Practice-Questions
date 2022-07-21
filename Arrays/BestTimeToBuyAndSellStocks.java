public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxProfit(final int[] A) {
        int min = Integer.MAX_VALUE, profit = 0;
        for(int i : A){
            min = Math.min(min, i);
            profit = Math.max(profit, i-min);
        }
        return profit;
    }
}
