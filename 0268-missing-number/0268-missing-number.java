// class Solution {
//     public int missingNumber(int[] nums) {
        
//         Set<Integer> set=new HashSet<>();
//         for(int ele:nums){
//             set.add(ele);
//         }

//         int n=nums.length;
//         for(int i=0;i<=n;i++){
//             if(!set.contains(i)) return i;
//         }
//         return -1;
//     }
// }
// Time complexity--O(n)
// Space Complexity--O(n);;


// Using bitwise operator
class Solution {
    public int missingNumber(int[] nums) {

     int n = nums.length;
        int xor = n;

        for (int i = 0; i < n; i++) {
            xor = xor ^ i ^ nums[i];
        }

        return xor;
    }
}