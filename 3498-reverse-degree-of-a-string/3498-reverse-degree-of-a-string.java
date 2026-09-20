class Solution {
    public int reverseDegree(String s) {
      char[] ch=s.toCharArray();
      
      int prod=0;
      for(int i=1;i<=ch.length;i++){
         prod += i * (26 - (ch[i - 1] - 'a'));
         
      } 
      return prod; 
    }
}