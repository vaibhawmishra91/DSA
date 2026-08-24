class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashMap<Character,Integer> map=new HashMap<>();
        
        int max=0;
        int left = 0;

       for(char ch:s.toCharArray()){
        if(map.containsKey(ch)){
          if(map.size()>max) max=map.size();
          
          while (map.containsKey(ch)) {
                    map.remove(s.charAt(left));
                    left++;
                }
           map.put(ch, 1);
        }
        else map.put(ch,map.getOrDefault(ch,0)+1);
       } 
        if (map.size() > max)
            max = map.size();
            
       return max;
    }
}