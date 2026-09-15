
class Solution {
    public boolean isPalindrome(String s, int left, int right) {
        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public int maxPalindromes(String s, int k) {

         int count = 0;
        int start = 0;

        for (int end = k - 1; end < s.length(); end++) {

            // Start with the smallest possible palindrome
            int left = end - k + 1;

            while (left >= start) {

                if (isPalindrome(s, left, end)) {

                    count++;

                    // Next palindrome starts after this one
                    start = end + 1;

                    break;
                }

                left--;
            }
        }

        return count;
    }
}

