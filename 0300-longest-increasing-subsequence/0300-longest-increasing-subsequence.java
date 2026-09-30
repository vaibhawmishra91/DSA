class Solution {
    public int lengthOfLIS(int[] nums) {

      int[] dp=new int[nums.length];
      Arrays.fill(dp,1);
        int maxlen=0;

      for(int i=0;i<nums.length;i++){
        int j=0;
        while(j<i){
            if(nums[j]<nums[i]){
            dp[i]=Math.max(dp[i],1+dp[j]); 
            }
            j++;
        }
        maxlen=Math.max(maxlen,dp[i]);
      }

      
      return maxlen;
    }
}