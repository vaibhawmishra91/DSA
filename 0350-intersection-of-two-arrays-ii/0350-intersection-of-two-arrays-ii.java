// class Solution {
//     public int[] intersect(int[] nums1, int[] nums2) {
//      Arrays.sort(nums1);   
//      Arrays.sort(nums2);

//      ArrayList<Integer> ans=new ArrayList<>();

//      int i=0;
//      int j=0;

//      while(i<nums1.length && j<nums2.length){
//         if(nums1[i]<nums2[j]) i++;
//         else if(nums1[i]>nums2[j]) j++;
//         else{
//             ans.add(nums1[i]);
//             i++;
//             j++;
//         }
//      }
//      int[] result = new int[ans.size()];

//         for (int k = 0; k < ans.size(); k++) {
//             result[k] = ans.get(k);
//         }

//         return result;
//     }
// }
// Sorting + Two Pointers
// time complexity--O(n log n + m log m)
// space complexity---O(min(n,m))

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

       HashMap<Integer,Integer> map=new HashMap<>();

       // Count frequency of nums1
       for (int ele : nums1) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

         ArrayList<Integer> ans=new ArrayList<>();
          // Check nums2
         for(int ele:nums2){
            if(map.containsKey(ele) && map.get(ele) > 0){
                ans.add(ele);
            map.put(ele, map.get(ele) - 1);
        }
         } 

         // Convert ArrayList<Integer> to int[]
        int[] result = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;    
    }
}