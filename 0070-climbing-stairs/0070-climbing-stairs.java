// class Solution {
//     public int climbStairs(int n) {
//         if(n==0||n==1) return  1;
//         int ways=climbStairs(n-1) +climbStairs(n-2);
//         return ways;
//     }
// }
// Time = O(2ⁿ)
// Space Complexity: O(n)


// Memoization
// class Solution {
//   static int[] dp = new int[46];
 
//     public int climbStairs(int n) {
// if(n==0||n==1) return  1;

// if(dp[n]!=0){
//     return dp[n];
// }
//         int ways=climbStairs(n-1) +climbStairs(n-2);
        
//         dp[n]=ways;
    
//     return ways;
// }
// }
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
  static int[] dp = new int[46];
 
    public int climbStairs(int n) {

        
      dp[0]=1;
      dp[1]=1;

      for(int i=2;i<=n;i++){
        dp[i]=dp[i-1]+dp[i-2];
      }

      return dp[n];
    }
}