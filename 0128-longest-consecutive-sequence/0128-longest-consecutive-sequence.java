class Solution {
    public int longestConsecutive(int[] nums) {
      Set<Integer> set=new HashSet<>();

      for(int ele:nums){ //to remove duplicate element
        set.add(ele);
      } 
       
      int maxlen=0;
     

      for(int ele:set){
        if(!set.contains(ele-1)){
            int curr=ele; //store cuurent elemt to to check next ele is present or not
            int  count=1;//count is outside the loop, so it doesn't reset for a new sequence.

            while (set.contains(curr + 1)) {
                    curr++;
                    count++;
                }
                maxlen = Math.max(maxlen, count);
        }
      }  
        return maxlen;
    }
}