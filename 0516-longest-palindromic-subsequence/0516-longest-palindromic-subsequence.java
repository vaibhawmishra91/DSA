class Solution {
    public int longestPalindromeSubseq(String s) {
      int n=s.length();

      String rev="";
      for (int i = s.length() - 1; i >= 0; i--) {
      rev += s.charAt(i);
      }
      int m=n;
    
    int[][] dp=new int[n][m];

    for(int i=0;i<dp.length;i++){
        Arrays.fill(dp[i],-1);
    }

     return lcs(n-1,m-1,s,rev,dp);
    }


    int lcs(int i,int j,String s,String rev, int[][] dp){
        if(i<0 || j<0) return 0;
         
        if(dp[i][j]!=-1) return dp[i][j];

        if(s.charAt(i)==rev.charAt(j)){
            dp[i][j]=1+lcs(i-1,j-1,s,rev,dp);
        }

        else{
            dp[i][j]=Math.max(lcs(i-1,j,s,rev,dp),lcs(i,j-1,s,rev,dp));
        }
        return dp[i][j];
    }
}