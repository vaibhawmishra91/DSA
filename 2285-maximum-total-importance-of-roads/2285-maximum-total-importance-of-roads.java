class Solution {
    public long maximumImportance(int n, int[][] roads) {

      long[]  degree=new long[n];
      for(int i=0;i<roads.length;i++){
        degree[roads[i][0]]++;
        degree[roads[i][1]]++;
      } 
    
    Arrays.sort(degree);
    
    int assign=1;
    long sum=0;
    
    for(int i=0;i<n;i++){
    sum+=degree[i]*assign;
    
    assign++;
    }

    return sum;
    }
}