class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
 
        List<List<Integer>> list=new ArrayList<>();
       
       // Store unique elements of nums1
      Set<Integer> set=new HashSet<>();
      for(int ele:nums1){
        set.add(ele);
      } 
      ArrayList<Integer> l1=new ArrayList<>(); 
      for(int ele:nums2){
        if(set.contains(ele)){
            set.remove(ele);
        }
      }
       for(int ele:set){
       l1.add(ele);
       }
       list.add(l1);

       Set<Integer> set2=new HashSet<>();
      for(int ele:nums2){
        set2.add(ele);
      } 

      ArrayList<Integer> l2=new ArrayList<>(); 
      for(int ele:nums1){
        if(set2.contains(ele)){
            set2.remove(ele);
        }
      }
       for(int ele:set2){
       l2.add(ele);
       }
       list.add(l2);

       return list;
    }
}