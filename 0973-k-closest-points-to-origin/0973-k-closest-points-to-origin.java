class Solution {

    class Triplet implements Comparable<Triplet> {
        int dis;
        int x;
        int y;

        Triplet(int dis, int x, int y) {
            this.dis = dis;
            this.x = x;
            this.y = y;
        }

        public int compareTo(Triplet t) {
            return this.dis - t.dis;
        }
    }

    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<Triplet> p =
            new PriorityQueue<>(Collections.reverseOrder());

        for (int[] point : points) {

            int x = point[0];
            int y = point[1];

            int dis = x * x + y * y;

            p.add(new Triplet(dis, x, y));

            if (p.size() > k) {
                p.remove();
            }
        }

        int[][] ans = new int[k][2];

        for (int i = 0; i < k; i++) {
            Triplet top = p.remove();

            ans[i][0] = top.x;
            ans[i][1] = top.y;
        }

        return ans;
    }
}