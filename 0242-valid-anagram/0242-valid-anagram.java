// class Solution {
//     public boolean isAnagram(String s, String t) {

//         if (s.length() != t.length())
//             return false;

//         int[] freq = new int[26];
//         for (int i = 0; i < s.length(); i++) {
//         freq[s.charAt(i) - 'a']++;
//          freq[t.charAt(i) - 'a']--;
// }
//      for (int count : freq) {
//     if (count != 0)
//         return false;
// }
//         return true;
//     }
// }

class Solution {
    public boolean isAnagram(String s, String t) {

    if (s.length() != t.length())
             return false;

    HashMap<Character,Integer> map =new HashMap<>();
    for(char ch:s.toCharArray()){
        if(map.containsKey(ch)){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        else map.put(ch,1);
    }
    for(char ch:t.toCharArray()){
         if (!map.containsKey(ch)) {
                return false;
            }

            map.put(ch, map.get(ch) - 1);
    }
    for(int freq:map.values()){
        if(freq!=0) return false ;
    }
    return true;
    }
}