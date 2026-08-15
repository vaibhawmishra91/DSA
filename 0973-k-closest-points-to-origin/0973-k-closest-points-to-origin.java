// class Solution {

//     class Triplet implements Comparable<Triplet> {
//         int dis;
//         int x;
//         int y;

//         Triplet(int dis, int x, int y) {
//             this.dis = dis;
//             this.x = x;
//             this.y = y;
//         }

//         public int compareTo(Triplet t) {
//             return this.dis - t.dis;
//         }
//     }

//     public int[][] kClosest(int[][] points, int k) {

//         PriorityQueue<Triplet> p =
//             new PriorityQueue<>(Collections.reverseOrder());

//         for (int[] point : points) {

//             int x = point[0];
//             int y = point[1];

//             int dis = x * x + y * y;

//             p.add(new Triplet(dis, x, y));

//             if (p.size() > k) {
//                 p.remove();
//             }
//         }

//         int[][] ans = new int[k][2];

//         for (int i = 0; i < k; i++) {
//             Triplet top = p.remove();

//             ans[i][0] = top.x;
//             ans[i][1] = top.y;
//         }

//         return ans;
//     }
// }
class Solution {
    class Point {
        int x, y, dist;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
            this.dist = x * x + y * y;
        }
    }

    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<Point> pq = new PriorityQueue<>(
            (a, b) -> b.dist - a.dist
        );

        for (int[] p : points) {
            pq.add(new Point(p[0], p[1]));

            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[][] ans = new int[k][2];

        for (int i = 0; i < k; i++) {
            Point p = pq.poll();
            ans[i][0] = p.x;
            ans[i][1] = p.y;
        }

        return ans;
    }
}