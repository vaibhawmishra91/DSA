class Solution {
    public boolean isHappy(int n) {
       HashSet<Integer> set = new HashSet<>();

        while (n != 1) {

            // If n already exists, we have a cycle
            if (set.contains(n)) {
                return false;
            }

            set.add(n);

            int sum = 0;

            // Calculate the sum of squares of digits
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n = n / 10;
            }

            n = sum;
        }

        return true; 
    }
}