class Solution {
    public int numRescueBoats(int[] people, int limit) {
      int n=people.length;
      int boat=0;
      Arrays.sort(people);
       int i=0;
       int j=n-1;
    //    if i<j element at i==j left in boat
       while(i<=j){
        int sum=people[i]+people[j];
        if(sum<=limit){
            boat++;
            i++;
            j--;
        }
        if(sum>limit){
            boat++;
            j--;
        }
       }
       return boat;
    }
}