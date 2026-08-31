
class Solution {

    public void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public String reverseWords(String s) {

        s = s.trim().replaceAll("\\s+", " ");
// 1. trim()
// Removes spaces from the start and end of the string.2. replaceAll

// ("\\s+", " ") ------\\s → whitespace (space, tab, etc.)         --" " → replace with one normal space
// Replaces multiple whitespace characters with one space.


        char[] arr = s.toCharArray();

        // Reverse whole string
        reverse(arr, 0, arr.length - 1);

        // Reverse each word
        int start = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == ' ') {
                reverse(arr, start, i - 1);
                start = i + 1;
            }
        }

        // Reverse last word
        // Our loop reverses a word only when it finds a space: for last word has no space after it.so
        reverse(arr, start, arr.length - 1);

        return new String(arr);
    }
}

