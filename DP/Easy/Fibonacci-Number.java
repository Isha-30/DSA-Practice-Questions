class Solution {
    //iterative solution
    
    public int fib(int n) {
        if(n<=1)
            return n;
        int a = 0, b = 1;
        while(n-- > 1){
            int sum = a+b;
            a = b;
            b = sum;
        }
        return b;
    }
}


//Recursive
class Solution {
    public int fib(int n) {
        if(n==0)return 0;
        else if(n==1)return 1;
        else return fib(n-1)+fib(n-2);     
    }
}


class Solution {
    //DP - Top Down Approach
    
    int[] dp = new int[31];
    public int fib(int n) {
        if(n<=1)
            return n;
        if(dp[n] != 0)
            return dp[n];
        else
            return dp[n] = fib(n-1)+fib(n-2);
    }
}

class Solution {
    //DP - Bottom Up Approach
    
    public int fib(int n) {
        if(n<=1)
            return n;
        int[] dp = new int[n+1];
        dp[1] = 1;
        for(int i = 2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
