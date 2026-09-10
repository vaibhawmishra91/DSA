/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int count=0;

    int sumOfSubtree(TreeNode root) {
        if (root == null)
            return 0;

        return root.val
             + sumOfSubtree(root.left)
             + sumOfSubtree(root.right);
    }

     int countNodes(TreeNode root) {
        if (root == null)
            return 0;

        return 1
             + countNodes(root.left)
             + countNodes(root.right);
    }

    public int averageOfSubtree(TreeNode root) {
      
if (root == null)
            return 0;

        int sum = sumOfSubtree(root);
        int nodes = countNodes(root);

        if (root.val == sum / nodes)
            count++;

        averageOfSubtree(root.left);
        averageOfSubtree(root.right);

        return count;
    }
}