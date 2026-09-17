// class Solution {
//     public int minCostClimbingStairs(int[] cost) {
        
//         int n = cost.length;
//          return cost_to_reach(n, cost);
//     }

//     private int cost_to_reach(int n, int[] cost) {
//         if (n == 0 || n == 1) {
//             return 0;
//         }

//           return Math.min(
//             cost[n - 1] + cost_to_reach(n - 1, cost),
//             cost[n - 2] + cost_to_reach(n - 2, cost)
//         );
//     }
// }
// Time Complexity (O(2^n)\) (Exponential)
// Space Complexity \(O(n)\) (Call Stack)


// class Solution {
//     public int minCostClimbingStairs(int[] cost) {
//         int n = cost.length;
//         int[] dp = new int[n + 1];

//         for (int i = 0; i <= n; i++) {
//             dp[i] = -1;
//         }

//         return cost_to_reach(n, cost, dp);
//     }

//     private int cost_to_reach(int n, int[] cost, int[] dp) {
//         if (n == 0 || n == 1) {
//             return 0;
//         }

//         if (dp[n] != -1) {
//             return dp[n];
//         }

//         dp[n] = Math.min(
//             cost[n - 1] + cost_to_reach(n - 1, cost, dp),
//             cost[n - 2] + cost_to_reach(n - 2, cost, dp)
//         );

//         return dp[n];
//     }
// }

class Solution {
    public int minCostClimbingStairs(int[] cost) {
     
    int n = cost.length;
        
     

        int prev1=0; // Represents cost_to_reach(i-1)
        int prev2=0; // Represents cost_to_reach(i-2)
         int ans=0;
        for(int state=2;state<=n;state++){

            int onestep=cost[state-1]+  prev1;
            int twostep=cost[state-2]+  prev2;

           ans=Math.min(onestep,twostep);
            
            prev2=prev1;
            prev1=ans;

        }
        
       return ans;
        
    }
}