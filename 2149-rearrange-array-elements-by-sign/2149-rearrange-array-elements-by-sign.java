class Solution {
    public int[] rearrangeArray(int[] nums) {

        int[] ans=new int[nums.length];

     int pos=0;
      int neg=1;

      for(int ele:nums){
        if(ele>0){
            ans[pos]=ele;
            pos=pos+2;
        }
        if(ele<0){
            ans[neg]=ele;
            neg=neg+2;
        }
      }
      
       return ans;         
    }
}