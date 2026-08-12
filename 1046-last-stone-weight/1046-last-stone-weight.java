class Solution {
    public int lastStoneWeight(int[] stones) {
       PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());
       for(int ele:stones){
        p.add(ele);
       } 
       while(p.size()>1){
       int y=p.remove();
       int x=p.remove();
       if (y == x) p.add(y - x);
       else p.add(y-x);
            
       }
       return p.remove();
    }
}