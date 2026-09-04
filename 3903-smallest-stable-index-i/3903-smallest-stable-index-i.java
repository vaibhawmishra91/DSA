class Solution {
    public int firstStableIndex(int[] nums, int k) {
        
       int n = nums.length;
        int max = Integer.MIN_VALUE;
        int min_ans = Integer.MAX_VALUE;
        int idx = -1;

        for (int i = 0; i < n; i++) {

            // max(nums[0..i])
            max = Math.max(nums[i], max);

            // min(nums[i..n-1])
            int min = Integer.MAX_VALUE;
            int j = i;

            while (j < n) {
                min = Math.min(nums[j], min);
                j++;
            }

            int ans = max - min;

            if (ans <= k) {
                idx = i;
                break;
            }
        }

        return idx;
    }
}