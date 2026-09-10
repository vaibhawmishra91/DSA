// class Solution {
//     public int subarraySum(int[] nums, int k) {

//         int count = 0;

//         for (int i = 0; i < nums.length; i++) {

//             int sum = 0;

//             for (int j = i; j < nums.length; j++) {

//                 sum += nums[j];

//                 if (sum == k) {
//                     count++;
//                 }
//             }
//         }

//         return count;
//     }
// }
// Time ccomplexity-O(n²);

class Solution {
    public int subarraySum(int[] nums, int k) {
      HashMap<Integer,Integer> map= new HashMap<>();
    //   map conatin sum and map with its freq
      
       map.put(0,1);

      int count=0;
      int sum=0;
      
      for(int i=0;i<nums.length;i++){
      sum+=nums[i];
      int rem=sum-k;
      
    //   value stored for rem; if rem does not exist, give me 0
      count+=map.getOrDefault(rem,0);

      // Store frequency of current prefix sum
      map.put(sum,map.getOrDefault(sum,0)+1);
      }
      return count;
    }
}