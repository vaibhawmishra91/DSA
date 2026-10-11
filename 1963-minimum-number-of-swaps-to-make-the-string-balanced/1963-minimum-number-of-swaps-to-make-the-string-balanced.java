class Solution {
    public int minSwaps(String s) {

       int open=0;
       int close=0;

       for(int i=0;i<s.length();i++){
        if(s.charAt(i)==']'){

            if(open>0) open--;
            else close++;
        }
        else open++;
       } 
       return (open + 1) / 2;
    }
}
// 1 or 2 unmatched opening brackets → 1 swap
// 3 or 4 unmatched opening brackets → 2 swaps
// 5 or 6 unmatched opening brackets → 3 swaps