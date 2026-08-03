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
    void leftview(TreeNode root,int level,ArrayList<Integer> ans){
        if(root==null) return;
       if(level==ans.size()) ans.add(root.val);
       leftview(root.right,level+1, ans); 
        leftview(root.left,level+1, ans);
         
         }
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        leftview(root,0, ans);
      return ans;
    }
}