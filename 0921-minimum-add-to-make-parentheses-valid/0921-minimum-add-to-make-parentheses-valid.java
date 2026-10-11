// class Solution {
//     public int minAddToMakeValid(String s) {

//     //   if(s.length()%2!=0) return -1;
//         // code here
//         int open=0;
//         int close=0;
    
//     Stack<Character> st=new Stack<>();
    
//     // removing balanced parenthesis
//     for(int i=0;i<s.length();i++){
//         if(s.charAt(i)==')' && !st.isEmpty() && st.peek()=='(') st.pop();
//         else {
//             st.push(s.charAt(i));
//         }
//     }
//     // count open and close bracket
//     while(!st.isEmpty()){
//         char ch=st.pop();
//         if(ch=='(') open++;
//         else close++;
//     }
    
//     //no of invalis open close bracket same no of bracket are required to  make them valis 
//       return open+close;
//     }
// }

class Solution {
    public int minAddToMakeValid(String s) {

    //   if(s.length()%2!=0) return -1;
        // code here
        int open=0;
        int close=0;
for(int i=0;i<s.length();i++){
    if(s.charAt(i)==')'){
        if(open>0) open--;
        else close++;
    }
    else open++;
}

return open+close;
    }
}