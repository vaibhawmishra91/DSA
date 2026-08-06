class Solution {
   void addLeftBoundary(Node root,ArrayList<Integer> list) {
        Node curr = root.left;

        while (curr != null) {
            if (!isLeaf(curr))
                list.add(curr.data);

            if (curr.left != null)
                curr = curr.left;
            else
                curr = curr.right;
        }
    }
    
    
    void addRightBoundary(Node root,ArrayList<Integer> list) {
        Node curr = root.right;
         Stack<Integer> st=new Stack<>();
        while (curr != null) {
            if (!isLeaf(curr))
                st.push(curr.data);

            if (curr.right != null)
                curr = curr.right;
            else
                curr = curr.left;
        }
        while(st.size()>0){
            list.add(st.pop());
    }
      }
    void addLeaves(Node root,ArrayList<Integer> list) {
        if (root == null)
            return;

        if (isLeaf(root)) {
            list.add(root.data);
            return;
        }

        addLeaves(root.left,list);
        addLeaves(root.right,list);
    }
    
    boolean isLeaf(Node node) {
    return node.left == null && node.right == null;
}
    
    
    public ArrayList<Integer> boundaryTraversal(Node root) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null) return list;
        if (!isLeaf(root))
        list.add(root.data);
        addLeftBoundary(root,list);
        addLeaves(root,list);
        addRightBoundary(root,list);
        return list;
        
    }
}
