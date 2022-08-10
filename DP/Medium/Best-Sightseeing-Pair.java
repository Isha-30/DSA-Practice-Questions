class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int ans = values[0];
        int prevBestIdx = 0;
        
        for(int j = 1; j<values.length; j++){
            int score = values[prevBestIdx] + prevBestIdx + values[j] - j;
            ans = Math.max(ans, score);
            
            if(values[prevBestIdx] + prevBestIdx < values[j]+j)
                prevBestIdx = j;
        }
        return ans;
    }
}
