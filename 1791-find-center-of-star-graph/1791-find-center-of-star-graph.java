class Solution {
    public int findCenter(int[][] edges) {

HashMap<Integer,Integer> freq=new HashMap<>();
       int totaledge=edges.length;
    for(int i=0;i<totaledge;i++){
    int u=edges[i][0];
    int v= edges[i][1];
    
    freq.put(u,freq.getOrDefault(u,0)+1);
    freq.put(v,freq.getOrDefault(v,0)+1);

    if(freq.get(u)==totaledge) return u;

    if(freq.get(v)==totaledge) return v;
    }
    return -1;

    }

}