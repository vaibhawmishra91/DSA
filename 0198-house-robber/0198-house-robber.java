//Recursion

// class Solution {
//         public int rob(int[] nums) {
//         int i=nums.length-1;
        
//         return maxAmout(nums,i);
//         }

//         int maxAmout(int[] nums,int i){
//             if(i==0) return nums[i];
//             if(i<0) return 0;

//             int pick=nums[i]+maxAmout(nums,i-2);
//             int nopick=0+maxAmout(nums,i-1);

//           return  Math.max(pick,nopick);
//         }
// }


// memoiztion
// class Solution {

//     int solve(int[] nums, int i, int[] dp) {

//         if (i < 0)
//             return 0;

//         if (dp[i] != -1)
//             return dp[i];

//         int pick = nums[i] + solve(nums, i - 2, dp);

//         int noPick = solve(nums, i - 1, dp);

//         return dp[i] = Math.max(pick, noPick);
//     }
//     Time Complexity: O(n)
// Space Complexity: O(n)

//     public int rob(int[] nums) {

//         int n = nums.length;

//         int[] dp = new int[n];
//         Arrays.fill(dp, -1);

//         return solve(nums, n - 1, dp);
//     }
// }

// class Solution {
//     public int rob(int[] nums) {

//         int n = nums.length;

//         if (n == 1)
//             return nums[0];

//         int[] dp = new int[n];

//         dp[0] = nums[0];
//         dp[1] = Math.max(nums[0], nums[1]);

//         for (int i = 2; i < n; i++) {

//             int pick = nums[i] + dp[i - 2];

//             int noPick = dp[i - 1];

//             dp[i] = Math.max(pick, noPick);
//         }

//         return dp[n - 1];
//     }
// }
// Time:  O(n)
// Space: O(n)


class Solution {
    public int rob(int[] nums) {

        int n = nums.length;

        if (n == 1)
            return nums[0];

        
        int prev2=0;
        int prev1 = nums[0];
        int ans=0;
        

        for (int state = 2; state <n+1; state++) {

            int pick = nums[state-1] +prev2 ;

            int noPick = 0+prev1;

            ans = Math.max(pick, noPick);

            prev2=prev1;
            prev1=ans;
        }

        return ans;
    }
}