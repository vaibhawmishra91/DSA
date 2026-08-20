// iterative approach Total = O(n log n) + O(n)    = O(n log n)
     
// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         Arrays.sort(nums);
//         for(int i=0;i<nums.length-1;i++){
//       if(nums[i]==nums[i+1]) return true;
    
//         }
//         return false;
//     }
// }

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>();

        for(int ele:nums){
            if(set.contains(ele)) return true;
            set.add(ele);
        }
        return false;
    }
}