class Solution {
    void bfs(int start,List<List<Integer>> rooms, boolean[] vis){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while(q.size()>0){
            int front=q.remove();  //int front = q.remove();
            for(int ele:rooms.get(front)){ //front is also a list so get ele of list
                if(!vis[ele]){
                    vis[ele]=true;
                    q.add(ele);
                }
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
       int n=rooms.size();// n is the number of rows in the outer list, which is also the number of rooms/node.
       boolean[] vis=new boolean[n];
       vis[0]=true;
       bfs(0,rooms,vis);
       for(boolean ele:vis){
        if(ele==false) return false;
       } 
       return true;
    }
}