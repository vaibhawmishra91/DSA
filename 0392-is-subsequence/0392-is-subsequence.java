class Solution {
    public boolean isSubsequence(String s, String t) {
      int i=0;
      int j=0;
   
      while(i<s.length() && j<t.length()){
          
        if(s.charAt(i)==t.charAt(j)){
         
            i++;
            j++;
        }
        else{
            j++;
            
        }
      }  
    //   true if i is at last index and false if not at last index
      return i==s.length();
    }
}