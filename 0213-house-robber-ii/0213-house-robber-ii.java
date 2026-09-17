// class Solution {

//     // Normal House Robber
//     public int rob_in_range(int[] nums) {

//         int n = nums.length;

//         if (n == 1)
//             return nums[0];

//         int prev2 = 0;
//         int prev1 = nums[0];
//         int ans = 0;

//         for (int state = 2; state < n + 1; state++) {

//             int pick = nums[state - 1] + prev2;

//             int noPick = prev1;

//             ans = Math.max(pick, noPick);

//             prev2 = prev1;
//             prev1 = ans;
//         }

//         return ans;
//     }

//     // House Robber II
//     public int rob(int[] nums) {

//         int n = nums.length;

//         if (n == 1)
//             return nums[0];

//         int[] num1 = new int[n - 1];
//         int[] num2 = new int[n - 1];

//         int j = 0;
//         int k = 0;

//         for (int i = 0; i < n; i++) {

//             // Exclude first house
//             if (i != 0) {
//                 num1[j] = nums[i];
//                 j++;
//             }

//             // Exclude last house
//             if (i != n - 1) {
//                 num2[k] = nums[i];
//                 k++;
//             }
//         }

//         return Math.max(
//             rob_in_range(num1),
//             rob_in_range(num2)
//         );
//     }
// }
// Time:  O(n)
// Space: O(n)

class Solution {

    public int rob(int[] nums) {

        int n = nums.length;

        if (n == 1)
            return nums[0];

        // Case 1: exclude last house
        int case1 = robRange(nums, 0, n - 2);

        // Case 2: exclude first house
        int case2 = robRange(nums, 1, n - 1);

        return Math.max(case1, case2);
    }

    int robRange(int[] nums, int start, int end) {

        int prev2 = 0;
        int prev1 = 0;

        for (int i = start; i <= end; i++) {

            int pick = nums[i] + prev2;

            int noPick = prev1;

            int curr = Math.max(pick, noPick);

            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}