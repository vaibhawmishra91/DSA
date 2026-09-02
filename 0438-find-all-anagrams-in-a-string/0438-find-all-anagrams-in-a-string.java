// class Solution {
//     public List<Integer> findAnagrams(String s, String p) {
//         ArrayList<Integer> ans=new ArrayList<>();

//         if (p.length() > s.length()) {
//             return ans;
//         }

//         int n=p.length();
//         int[] freq=new int[26];

//         for(int i=0;i<n;i++){
//             char c=p.charAt(i);
//           freq[c-'a']++;
//         }

//       int i=0;
//       int j=n-1;
//       while(j<s.length()){

//         int[] temp=new int[26];
//         int k=i;

//         while(k<=j){
//             char  c=s.charAt(k);
//             temp[c-'a']++;
//               k++;
//         }
//         if(Arrays.equals(temp,freq)) ans.add(i);
        
//         i++;
//         j++;
//       }
//       return ans;
//     }
// }

// Time = O(S × P)
// Space Complexity: O(26) = O(1)


class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        if (p.length() > s.length()) {
            return ans;
        }

        int n = p.length();

        int[] freq = new int[26];
        int[] window = new int[26];

        // Frequency of p
        for (int i = 0; i < n; i++) {
            freq[p.charAt(i) - 'a']++;
        }

        int i = 0;
        int j = 0;

        while (j < s.length()) {

            // Add current character
            window[s.charAt(j) - 'a']++;

            // Window size becomes n
            if (j - i + 1 == n) {

                if (Arrays.equals(freq, window)) {
                    ans.add(i);
                }

                // Remove left character
                window[s.charAt(i) - 'a']--;

                i++;
            }

            j++;
        }

        return ans;
    }
}
// Time: O(S × 26) → O(S)
// Space: O(26) → O(1)