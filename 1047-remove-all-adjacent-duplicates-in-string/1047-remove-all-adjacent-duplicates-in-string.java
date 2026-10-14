class Solution {
    public String removeDuplicates(String s) {

   Stack<Character> st=new Stack<>();

   int n=s.length();

   for(int i=n-1;i>=0;i--){

    if(!st.isEmpty() && s.charAt(i)==st.peek()) st.pop();
    else st.push(s.charAt(i));
   }

   String ans="";
   while(!st.isEmpty()){
      ans+=st.pop();
   }

   return ans;
    }
}