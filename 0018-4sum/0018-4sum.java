class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
       
         List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);
        int n = nums.length;
         
         for(int start=0;start<n-3;start++){
          
          if (start > 0 && nums[start] == nums[start - 1]) {
                continue;
            }

        for (int i = start+1; i < n - 2; i++) {

            // Skip duplicate first elements
            if (i > start+1 && nums[i] == nums[i - 1])
                continue;

            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                long sum = (long)nums[start]+nums[i] + nums[j] + nums[k];

                if (sum == target) {
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(nums[start]);
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);

                     // Add this triplet to the final answer
                    ans.add(temp);

                    j++;
                    k--;

                    // Skip duplicate second elements
                    while (j < k && nums[j] == nums[j - 1])
                        j++;

                    // Skip duplicate third elements
                    while (j < k && nums[k] == nums[k + 1])
                        k--;

                } else if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
         }

        return ans;
    }
}