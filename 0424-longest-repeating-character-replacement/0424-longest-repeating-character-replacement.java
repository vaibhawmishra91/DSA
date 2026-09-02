// class Solution {
//     public int characterReplacement(String s, int k) {

//         int answer = 0;

//         for (int i = 0; i < s.length(); i++) {

//             int[] freq = new int[26];
//             int maxFreq = 0;

//             for (int j = i; j < s.length(); j++) {

//                 // Count character
//                 freq[s.charAt(j) - 'A']++;

//                 // Maximum frequency
//                 maxFreq = Math.max(maxFreq,
//                                    freq[s.charAt(j) - 'A']);

//                 // Window length
//                 int length = j - i + 1;

//                 // Characters we need to replace
//                 int replace = length - maxFreq;

//                 if (replace <= k) {
//                     answer = Math.max(answer, length);
//                 }
//             }
//         }

//         return answer;
//     }
// }

class Solution {
    public int characterReplacement(String s, int k) {

    int i=0;
    int j=0;

    int maxfreq=0;
    int answer=0;

    int[] freq=new int[26];

    while(j< s.length()){

        char c=s.charAt(j);

        freq[c-'A']++;

       maxfreq=Math.max(maxfreq,freq[c-'A']);

       int length=j-i+1;

       // Valid condition: length - maxfreq <= k
            // If it is greater than k, shrink the window
            if (length - maxfreq > k) {
                freq[s.charAt(i) - 'A']--;
                i++;
            }

            answer = Math.max(answer, j - i + 1);

            j++;
        }

        return answer;
    }
    }
