class Solution {
    public int findPeakElement(int[] nums) {
        // int n = nums.length;

        // if (n == 1) return 0;

        // if (nums[0] > nums[1]) return 0;

        // if (nums[n - 1] > nums[n - 2]) return n - 1;

        // for (int i = 1; i < n - 1; i++) {
        //     if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
        //         return i;
        //     }
        // }

        // return -1;
          int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[mid + 1]) {
                // Peak is at mid or on the left side
                high = mid;
            } else {
                // Peak is on the right side
                low = mid + 1;
            }
        }

        return low;
            }
}