class Solution {
    public boolean checkInclusion(String s1, String s2) {
       int[] freq=new int[26];
       int len=s1.length();

       int i=0;

       while(i<len){
        char c=s1.charAt(i);
        freq[c-'a']++;
        i++;
       }

      i=0;
      int j=len-1;
           
     while(j<s2.length()){
        int k=i;
        int[] temp=new int[26];

        while(k<=j){
        char c=s2.charAt(k);
        temp[c-'a']++;
        k++;
    }
        if(Arrays.equals(freq,temp)) return true;

        i++;
        j++;
     }
      
      return false;
    }
}