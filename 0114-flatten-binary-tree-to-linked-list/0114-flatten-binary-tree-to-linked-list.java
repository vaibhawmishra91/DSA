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
    static void dfs(TreeNode root,ArrayList<TreeNode> list){
        if(root==null) return;
      list.add(root);
      dfs(root.left,list);
      dfs(root.right,list);
    }
    public void flatten(TreeNode root) {
      ArrayList<TreeNode> list=new ArrayList<>();
      dfs(root,list);

        if (list.isEmpty()) return; 
        
      for(int i=0;i<list.size()-1;i++){
        TreeNode a=list.get(i);
        TreeNode b=list.get(i+1);
         a.left=null;
         a.right=b;
      }
       TreeNode last=list.get(list.size() - 1);
         last.left=null;
         last.right=null;
    }
}