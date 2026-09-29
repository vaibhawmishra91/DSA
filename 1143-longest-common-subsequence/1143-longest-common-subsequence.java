// class Solution {
//     public int longestCommonSubsequence(String text1, String text2) {
//         int n=text1.length();
//          int m=text2.length(); 
//          return recr(n-1,m-1,text1, text2);
//     }

//     int recr(int i,int j,String text1, String text2){
//         // base case
//         if(i<0 || j<0) return 0;

//         if(text1.charAt(i)==text2.charAt(j)){
//             return 1+recr(i-1,j-1,text1, text2);
//         }
//         else{
//             int case1=recr(i-1,j,text1, text2);
//             int case2=recr(i,j-1,text1, text2);
//             return Math.max(case1,case2);
//         }
//     }
// }
// LCS Recursive

// Time  → O(2^(n+m))   [exponential]
// Space → O(n+m)       [recursion stack]

// class Solution {
//     public int longestCommonSubsequence(String text1, String text2) {

//         int n = text1.length();
//         int m = text2.length();

//         int[][] dp = new int[n][m];

//         // -1 means this state has not been calculated
//         for (int i = 0; i < n; i++) {
//             Arrays.fill(dp[i], -1);
//         }

//         return recr(n - 1, m - 1, text1, text2, dp);
//     }

//     int recr(int i, int j, String text1, String text2, int[][] dp) {

//         // Base case
//         if (i < 0 || j < 0) {
//             return 0;
//         }

//         // Already calculated
//         if (dp[i][j] != -1) {
//             return dp[i][j];
//         }

//         // Characters are same
//         if (text1.charAt(i) == text2.charAt(j)) {

//             return dp[i][j] =
//                     1 + recr(i - 1, j - 1, text1, text2, dp);
//         }

//         // Characters are different
//         int case1 = recr(i - 1, j, text1, text2, dp);
//         int case2 = recr(i, j - 1, text1, text2, dp);

//         return dp[i][j] = Math.max(case1, case2);
//     }
// }

// class Solution {
//     public int longestCommonSubsequence(String text1, String text2) {

//          int n = text1.length();
//          int m = text2.length();

//          int[][] dp = new int[n+1][m+1];
//          dp[0][0]=0;

//          for(int i=1;i<=n;i++){
//             for(int j=1;j<=m;j++){

//                 if(text1.charAt(i-1)==text2.charAt(j-1)){
//                    dp[i][j] = 1 + dp[i - 1][j - 1];
//                 }
//                 else{
//                    dp[i][j] = Math.max(dp[i - 1][j],dp[i][j - 1]);  
//                 }
//             }
//          }
//           return dp[n][m];
//     }
// }

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {

        int n = text1.length();
        int m = text2.length();

        int[] prev = new int[m + 1];
        int[] curr = new int[m + 1];

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= m; j++) {

                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    curr[j] = 1 + prev[j - 1];
                } 
                else {
                    curr[j] = Math.max(prev[j], curr[j - 1]);
                }
            }

            prev = curr;
            curr = new int[m + 1];
        }

        return prev[m];
    }
}