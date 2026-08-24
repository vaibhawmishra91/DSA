class Solution {
    public int maxOperations(int[] nums, int k) {
      HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int ele : nums) {

            int need = k - ele;

            if (map.containsKey(need)) {
                count++;
                map.put(need, map.get(need) - 1);

                if (map.get(need) == 0) {
                    map.remove(need);
                }
            } else {
                map.put(ele, map.getOrDefault(ele, 0) + 1);
            }
        }

        return count;  
    }
}