class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
      
        int minidx=0;
        int maxidx=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<nums[minidx]) {
                minidx=i;
            }
            if(nums[i]>nums[maxidx]){
              maxidx=i;
            } 
        }
       
    //    remove element from left
       int left=1+Math.max(minidx,maxidx);

      //    remove element from right
       int right=n-Math.min(minidx,maxidx);

    //    remove element from both left and right
       int both=Math.min(minidx, maxidx) + 1
                 + n - Math.max(minidx, maxidx);

       return Math.min(both,Math.min(left,right));
    }
}