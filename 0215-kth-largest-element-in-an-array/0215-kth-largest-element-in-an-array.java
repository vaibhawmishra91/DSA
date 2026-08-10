class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> p=new PriorityQueue<>();

        for(int ele:nums){
            p.add(ele);
            if(p.size()>k) p.remove();
            
        }
        return p.peek();
    }
}