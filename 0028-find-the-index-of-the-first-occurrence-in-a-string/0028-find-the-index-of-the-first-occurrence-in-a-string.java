class Solution {
    private int[] buildLPS(String needle){
     int len=0;
      int i=1;
      int m=needle.length();

      int[] lps=new int[m];

      while(i<m){
        if(needle.charAt(len) == needle.charAt(i)){
            len++;
            lps[i]=len;
            i++;
        }
        else{
            if(len==0) i++;
            else len=lps[len-1];
            }
      }
      return lps;
    }

    public int strStr(String haystack, String needle) {
    //   KMP Algo
    char[] pattern=needle.toCharArray();
    // buils lps
    int[] lps=buildLPS(needle);
    // compare
    int i=0;//text
    int j=0;//pattern
    int n=haystack.length();
    int m=needle.length();
    while(i<n){
      if(haystack.charAt(i)==needle.charAt(j)){
        i++;
        j++;
        if(j==m){//whole pattern is matched
         return i-m;
        }
      }
      else{
        if(j==0) i++;
        else j=lps[j-1];
      }
    }
    return -1;  
    }
}