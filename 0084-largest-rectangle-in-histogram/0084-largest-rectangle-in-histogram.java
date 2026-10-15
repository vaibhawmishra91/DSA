
class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;

        Stack<Integer> st = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i <= n; i++) {

            // agar right me small heigh nahi hai to i==n hoga ,to hame height 0 le lenge
            int currHeight = (i == n) ? 0 : heights[i];

            while (!st.isEmpty() && currHeight < heights[st.peek()]) {

                // FIX 1: Height comes from the popped index
                int poppedIndex = st.pop();
                int height = heights[poppedIndex];

                int width;

                if (st.isEmpty()) {
                    width = i;
                } else {
                    width = i - st.peek() - 1;
                }

                int area = height * width;
                maxArea = Math.max(maxArea, area);
            }

            // Don't push the imaginary index n
            if (i < n) {
                st.push(i);
            }
        }

        return maxArea;
    }
}
