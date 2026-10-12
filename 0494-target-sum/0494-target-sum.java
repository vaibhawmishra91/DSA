class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return solve(nums, target, nums.length - 1, 0);
    }

    int solve(int[] nums, int target, int i, int sum) {
        if (i < 0) {
            return sum == target ? 1 : 0;
        }

        int add = solve(nums, target, i - 1, sum + nums[i]);
        int subtract = solve(nums, target, i - 1, sum - nums[i]);

        return add + subtract;
    }
}