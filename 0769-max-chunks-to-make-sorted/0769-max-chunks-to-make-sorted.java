class Solution {
    public int maxChunksToSorted(int[] arr) {
        int max=Integer.MIN_VALUE;
        int chunk=0;
        for(int i=0;i<arr.length;i++){
          max=Math.max(max,arr[i]);

          if(max<i+1) chunk++;
        }
    return chunk;
    }
}