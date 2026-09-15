class Solution {
    public int compress(char[] chars) {
        int idx=0;

       int i=0;
       while(i<chars.length){
        int count=1;
        while(i + 1 < chars.length &&chars[i]==chars[i+1]){
            count++;
            i++;
        }
        chars[idx++]=chars[i];

        if (count > 1) {
                 String s = String.valueOf(count);//converting digit to string

                 for (char ch : s.toCharArray()) {//string cannot store in char array so convert into chars array
                    chars[idx++] = ch;
                }
            }
            i++;
       }
       return idx;
    }
}