class Solution {
    public int maximalSquare(char[][] arr) {
        int m = arr.length, n = arr[0].length;
        int[][] dp = new int[m][n];
        int ans = 0;
        
        for(int i = m-1; i>=0; i--){
            for(int j = n-1; j>=0; j--){
                if(i == m -1 && j == n-1){//bottom right corner cell 
                    dp[i][j] = arr[i][j] - '0';
                }
                else if(i == m -1){// last row as it is
                    dp[i][j] = arr[i][j] - '0';
                }
                else if(j == n-1){//last column as it is
                    dp[i][j] = arr[i][j] - '0';
                }
                else{
                    if(arr[i][j]=='0')
                        dp[i][j] = 0;
                    else{//checking square size with dp[i][j] as top left corner of that square
                        int min = Math.min(dp[i+1][j], dp[i][j+1]);
                        min = Math.min(min, dp[i+1][j+1]);
                        
                        dp[i][j] = min+1;
                        
                    }
                }
                
                if(dp[i][j] > ans)
                ans = dp[i][j];
            }
        }
        
        return ans*ans;
    }
}
