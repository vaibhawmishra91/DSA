class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> ans=new ArrayList<>();

        if (p.length() > s.length()) {
            return ans;
        }

        int n=p.length();
        int[] freq=new int[26];

        for(int i=0;i<n;i++){
            char c=p.charAt(i);
          freq[c-'a']++;
        }

      int i=0;
      int j=n-1;
      while(j<s.length()){

        int[] temp=new int[26];
        int k=i;

        while(k<=j){
            char  c=s.charAt(k);
            temp[c-'a']++;
              k++;
        }
        if(Arrays.equals(temp,freq)) ans.add(i);
        
        i++;
        j++;
      }
      return ans;
    }
}