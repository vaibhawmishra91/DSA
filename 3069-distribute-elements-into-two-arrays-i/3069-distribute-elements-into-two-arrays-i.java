class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> arr=new ArrayList<>(); 
        ArrayList<Integer> arr2=new ArrayList<>();

        arr.add(nums[0]);
        arr2.add(nums[1]);

        for(int i=2;i<n;i++){
           if (arr.get(arr.size() - 1) > arr2.get(arr2.size() - 1)) {
                arr.add(nums[i]);
            }
            else arr2.add(nums[i]);
        }
        int size=arr.size()+arr2.size();

    int[] result=new int[size];
     int k=0;
     for(int ele:arr){
        result[k++]=ele;
     }
     for(int ele:arr2){
          result[k++]=ele;
     }
     
     return result;
    }
}