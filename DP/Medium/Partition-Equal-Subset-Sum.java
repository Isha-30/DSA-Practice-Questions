public class Solution {
	public static boolean canPartition(int[] arr, int n) {
		int totalSum = 0;
        for(int i : arr)
            totalSum += i;
		
	//if sum is odd, no two subsets can have equal sum
        if(totalSum %2 != 0)
            return false;
        
        int k = totalSum/2;
        
        boolean[][] dp = new boolean[n][k+1];

        for(int i = 0; i<n; i++){
            dp[i][0] = true;
        }

        if(arr[0] <= k)
            dp[0][arr[0]] = true;

        for(int ind = 1; ind<n; ind++){
            for(int target = 1; target <= k; target++){
                boolean notTake = dp[ind-1][target];
                boolean take = false;
                if(arr[ind] <= target)
                    take = dp[ind-1][target - arr[ind]];

                dp[ind][target] = take || notTake;
            }   
        }
        return dp[n-1][k];
	}
}
