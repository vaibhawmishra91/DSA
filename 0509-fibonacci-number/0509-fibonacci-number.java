// Top-Down DP (Memoization).
// class Solution {
//     static int[] dp=new int[31];

//     public int fib(int n) {
//       if(n==0||n==1) return n;
//       if(dp[n]!=0) return dp[n];
//       int ans=fib(n-1)+fib(n-2);
//       dp[n]=ans;
//       return ans;  
//     }
// }
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    static int[] dp=new int[31];

      public int fib(int n) {

         if (n <= 1) return n;
     dp[0]=0;
     dp[1]=1;
     for(int i=2;i<=n;i++){
       dp[i]=dp[i-1]+dp[i-2];
     }
     return dp[n];
      }
}