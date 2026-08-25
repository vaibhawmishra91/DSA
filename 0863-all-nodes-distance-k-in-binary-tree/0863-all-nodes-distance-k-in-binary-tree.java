/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 class Pair {
    TreeNode node;
    int dist;

    Pair(TreeNode node, int dist) {
        this.node = node;
        this.dist = dist;
    }
}
class Solution {
    static TreeNode start;
    static HashMap<TreeNode, TreeNode> parent;

    public static void dfs(TreeNode root, int target) {

        if (root == null)
            return;

        if (root.val == target)
            start = root;

        if (root.left != null)
            parent.put(root.left, root);

        if (root.right != null)
            parent.put(root.right, root);

        dfs(root.left, target);
        dfs(root.right, target);
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        parent = new HashMap<>();

        // Create parent map
        dfs(root, target.val);

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(target, 0));

        HashSet<TreeNode> visited = new HashSet<>();
        visited.add(target);

        List<Integer> ans = new ArrayList<>();

        while (!q.isEmpty()) {

            Pair front = q.remove();

            TreeNode node = front.node;
            int dist = front.dist;

            // If distance is k
            if (dist == k) {
                ans.add(node.val);
                continue;
            }

            // Left
            if (node.left != null && !visited.contains(node.left)) {
                q.add(new Pair(node.left, dist + 1));
                visited.add(node.left);
            }

            // Right
            if (node.right != null && !visited.contains(node.right)) {
                q.add(new Pair(node.right, dist + 1));
                visited.add(node.right);
            }

            // Parent
            if (parent.containsKey(node)
                    && !visited.contains(parent.get(node))) {

                TreeNode par = parent.get(node);

                q.add(new Pair(par, dist + 1));
                visited.add(par);
            }
        }

        return ans;
    }
}