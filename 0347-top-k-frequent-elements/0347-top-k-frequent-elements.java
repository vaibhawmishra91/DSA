class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      HashMap<Integer,Integer> map=new HashMap<>();

        for (int ele : nums) {
            if (map.containsKey(ele)) {
                map.put(ele, map.get(ele) + 1);
            } else {
                map.put(ele, 1);
            }
        }

        // Store elements
        ArrayList<Integer> list = new ArrayList<>(map.keySet());

        // Sort by frequency
        list.sort((a, b) -> map.get(b) - map.get(a));

        // Take top k
        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}       