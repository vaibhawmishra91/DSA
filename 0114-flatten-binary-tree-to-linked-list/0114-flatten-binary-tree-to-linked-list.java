
// class Solution {
//     static void dfs(TreeNode root,ArrayList<TreeNode> list){
//         if(root==null) return;
//       list.add(root);
//       dfs(root.left,list);
//       dfs(root.right,list);
//     }
//     public void flatten(TreeNode root) {
//       ArrayList<TreeNode> list=new ArrayList<>();
//       dfs(root,list);

//         if (list.isEmpty()) return; 

//       for(int i=0;i<list.size()-1;i++){
//         TreeNode a=list.get(i);
//         TreeNode b=list.get(i+1);
//          a.left=null;
//          a.right=b;
//       }
//        TreeNode last=list.get(list.size() - 1);
//          last.left=null;
//          last.right=null;
//     }
// }
class Solution {
      public void flatten(TreeNode root) {
        
        while(root!=null){
        if(root.left==null) root=root.right;
        else{
            TreeNode curr=root.left;
            while(curr.right!=null){
                curr=curr.right;
            }
            curr.right=root.right;
            root.right=root.left;
            root.left=null;
            root=root.right;
        }
      }
      }
}