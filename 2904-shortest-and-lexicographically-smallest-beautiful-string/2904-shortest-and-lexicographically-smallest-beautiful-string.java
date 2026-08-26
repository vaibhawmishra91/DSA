class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
    
     
        int i = 0;
        int ones = 0;
        int minLen = Integer.MAX_VALUE;
        String ans = "";

        for (int j = 0; j < s.length(); j++) {

            if (s.charAt(j) == '1')
                ones++;

            while (ones > k) {
                if (s.charAt(i) == '1')
                    ones--;
                i++;
            }

            if (ones == k) {

                // Remove unnecessary leading zeroes
                while (s.charAt(i) == '0')
                    i++;

                int len = j - i + 1;

                if (len < minLen) {
                    minLen = len;
                    ans = s.substring(i, j + 1);
                }
                else if (len == minLen) {
                    String current = s.substring(i, j + 1);

                    if (current.compareTo(ans) < 0)
                        ans = current;
                }
            }
        }

        return ans;
    }
}