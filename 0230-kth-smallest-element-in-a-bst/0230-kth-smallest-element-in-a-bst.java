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
// class Solution {
//      ArrayList<Integer> inorder(TreeNode root,ArrayList<Integer> list ){
//          if(root==null) return list;
//              inorder(root.left,list);
//         list.add(root.val);
    
//         inorder(root.right,list);
//         return list;
//     }
//     public int kthSmallest(TreeNode root, int k) {
//         ArrayList<Integer> list=new ArrayList<>();
//         inorder(root,list);
//         return list.get(k-1);
//     }
// }

class Solution {

    int count = 0;
    int ans = 0;

    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return ans;
    }

    void inorder(TreeNode root, int k) {
        if (root == null) return;

        inorder(root.left, k);

        count++;

        if (count == k) {
            ans = root.val;
            return;
        }

        inorder(root.right, k);
    }
}