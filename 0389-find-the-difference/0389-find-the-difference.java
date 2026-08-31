class Solution {
    public char findTheDifference(String s, String t) {

       int[] freq=new int[26];
    //    char ans="";
       for(int i=0;i<s.length();i++){
        freq[s.charAt(i)-'a']++;
        freq[t.charAt(i)-'a']--;
       } 
        freq[t.charAt(s.length()) - 'a']--;

       for(int i=0;i<26;i++){
        if(freq[i]==-1){
        return  (char)(i+'a');
        }
       }
       return ' ';
    }
}